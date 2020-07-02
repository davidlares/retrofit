package com.davidlares.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.davidlares.retrofit.model.DataItem;
import com.davidlares.retrofit.services.MyWebService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Retrofit Log";
    private Button mButton;
    private TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        tView = (TextView) findViewById(R.id.textView);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customCall();
            }
        });
    }

    public void customCall() {
        MyWebService myWebService = MyWebService.retrofit.create(MyWebService.class);
        Call<List<DataItem>> call = myWebService.dataItems();
        call.enqueue(new Callback<List<DataItem>>() {
            @Override
            public void onResponse(Call<List<DataItem>> call, Response<List<DataItem>> response) {
                if(response.isSuccessful()) {
                    for (DataItem item : response.body()) {
                        Log.d(TAG, "Record: " + item.toString());
                        tView.append(item.toString() + "\n");
                    }
                }
            }

            @Override
            public void onFailure(Call<List<DataItem>> call, Throwable t) {
                // do something if fails
            }
        });
    }
}

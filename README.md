# Android Retrofit

`Retrofit` is a library built by the `Squareup` team that let's you perform async HTTP requests easily.

You will need to define a web service location based on a Java Interface (this is not mandatory).

The "good" thing about `Retrofit` is that can handle network requests without creating any can of Thread or AsyncTask.

In this repository I perform a `GET HTTP Request` to the `Typicode Fake server` for testing purposes only. Check the `build.gradle` file for the custom implementations of the dependencies used, including `retrofit` and `gson` for parsing requested data into Java Objects.

## Background Threads

Any software naturally runs code instructions one at a time, these ones are run in sequence. But modern software has the capability to take advantage of every aspect of the hardware specs, especially CPU's. Actually nowadays any computer without multiple CPUs it's pretty much considered old.

So, getting back to the first idea, once a task or instruction is executed, the CPU can't do anything else, this is called a blocking call.

## Multithreading

This term takes place directly for computers with multiple CPUs (Cores) when the CPU it's able to generate multiple Threads that can be executed concurrently. That's the case for modern Android devices, almost all of them have multiple cores in its configuration.

The main Thread is used for UI related activities, this is mandatory, and another operations are handled or should be done with the help of the threading techniques, this is because the any demanding operation can freeze the UI, the same happens with network-related operations.

## Credits

 - [David E Lares](https://twitter.com/davidlares3)

## License

 - [MIT](https://opensource.org/licenses/MIT)

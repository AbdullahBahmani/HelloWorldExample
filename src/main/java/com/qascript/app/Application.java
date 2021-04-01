package com.qascript.app;

public class Application {

<<<<<<< HEAD
    private final String message = "Hellld! Yesx Run it";
=======
    private final String message = "Hello World! Yesx Run it";
>>>>>>> 95365e30b219f84a8530e78e50533504ef3063f8

    public Application() {}

    public static void main(String[] args){
        System.out.println(new Application().getMessage());

    }

    public final String getMessage(){
        return message;
    }

}

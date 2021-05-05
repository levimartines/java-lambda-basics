package io.levimartines;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public Greeter(){}

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreetingImpl());
    }

}

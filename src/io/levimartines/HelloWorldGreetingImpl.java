package io.levimartines;

public class HelloWorldGreetingImpl implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello world!");
    }
}

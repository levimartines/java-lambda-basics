package io.levimartines;

public class RunnableExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        Thread lambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));

        lambdaThread.start();

    }

}

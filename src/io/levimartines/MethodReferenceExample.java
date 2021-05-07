package io.levimartines;

public class MethodReferenceExample {

    public static void main(String[] args) {

        // Mesma coisa que : new Thread(() -> printMessage());
        Thread thread = new Thread(MethodReferenceExample::printMessage);
        thread.start();

    }

    public static void printMessage() {
        System.out.println("Hello Thread");
    }

}

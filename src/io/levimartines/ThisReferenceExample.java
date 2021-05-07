package io.levimartines;

import java.util.function.Consumer;

public class ThisReferenceExample {

    public static void main(String[] args) {
        ThisReferenceExample example = new ThisReferenceExample();
        example.doProcess(10, i -> {
            System.out.println("Value of i: " + i);
            // Em expressões lambda, o this referencia o contexto de onde ela foi criada.
            // System.out.println("This: " + this);
        });

        // Nesse caso o this do método execute referencia ao objeto example.
        example.execute();

    }

    public void doProcess(int i, Consumer<Integer> consumer) {
        consumer.accept(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i: " + i);
            System.out.println("This: " + this);
        });
    }
}

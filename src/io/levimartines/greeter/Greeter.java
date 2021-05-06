package io.levimartines.greeter;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public Greeter(){}

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Cria uma nova instância da classe HelloWorldGreetingImpl, que implementa o método perform
        Greeting helloWorldGreeting = new HelloWorldGreetingImpl();

        // Criando uma classe anônima interna, mas ainda é diferente de uma função Lambda
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello world from Inner Class");
            }
        };

        // Não instanciamos um novo objeto, apenas criamos a função usando Lambda
        Greeting lambdaGreeting = () -> System.out.println("Hello world using Lambda!");

        greeter.greet(helloWorldGreeting);
        greeter.greet(innerClassGreeting);
        greeter.greet(lambdaGreeting);
    }

}

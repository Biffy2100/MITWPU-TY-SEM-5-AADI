import java.util.function.*;

public class A {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println(supplier.get());

        Consumer<String> consumer = (s) -> System.out.println("Consumed: " + s);
        consumer.accept("Java Functional Interfaces");

        Function<Integer, Integer> function = (x) -> x * x;
        System.out.println("Square of 5: " + function.apply(5));

        Predicate<Integer> predicate = (x) -> x > 0;
        System.out.println("Is 10 positive? " + predicate.test(10));
    }
}
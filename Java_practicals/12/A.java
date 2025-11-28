import java.util.function.*;

public class A {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> 65436543;
        System.out.println(s.get());

        Consumer<String> c = (y) -> System.out.println("Consumed: " + y);
        c.accept("Java Functional Interfaces");

        Function<Integer, Integer> function = (x) -> x * x;
        System.out.println("Square of 5: " + function.apply(5));

        Predicate<Integer> p = (x) -> x > 0;
        System.out.println("Is 10 positive? " + p.test(10));
    }
}
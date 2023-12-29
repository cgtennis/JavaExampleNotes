package java8;

import java.util.function.Function;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        Function<Integer, Double> function = t -> t / 3.0;
        System.out.println(function.apply(2));

        Function<Integer, Integer> f2 = t -> t * t;
        System.out.println(f2.apply(5));
    }
}

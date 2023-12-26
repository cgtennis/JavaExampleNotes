package stream;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StreamConcept {

    public static void main(String[] args) {

        Consumer<Integer> myConsumer = n -> System.out.println("Printing:" + n);
        myConsumer.accept(12);
        myConsumer.accept(33);

        Supplier<String> mySupplier = () -> LocalDateTime.now().toString();
        System.out.println(mySupplier.get());
        System.out.println(mySupplier.get());




    }
}

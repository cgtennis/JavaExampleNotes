package java8;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * The Stream interface in Java provides a variety of methods for processing sequences of elements.
 * filter(Predicate<T> predicate):
 * Usage: Filters elements based on a given condition.
 * Example: stream.filter(x -> x > 5)
 *
 * map(Function<T, R> mapper):
 * Usage: Transforms each element using the provided function.
 * Example: stream.map(x -> x * 2)
 *
 * flatMap(Function<T, Stream<R>> mapper):
 * Usage: Transforms each element into a stream and flattens the result.
 * Example: stream.flatMap(x -> Stream.of(x, x * 2))
 *
 * distinct():
 * Usage: Removes duplicate elements from the stream.
 * Example: stream.distinct()
 *
 * sorted():
 * Usage: Sorts the elements of the stream.
 * Example: stream.sorted()
 *
 * peek(Consumer<T> action):
 * Usage: Performs an action on each element and returns the stream unchanged.
 * Example: stream.peek(x -> System.out.println(x))
 *
 * forEach(Consumer<T> action):
 * Usage: Performs an action on each element.
 * Example: stream.forEach(x -> System.out.println(x))
 *
 * reduce(BinaryOperator<T> accumulator):
 * Usage: Performs a reduction on the elements using the provided binary operator.
 * Example: stream.reduce((x, y) -> x + y)
 *
 * collect(Collector<T, A, R> collector):
 * Usage: Performs a mutable reduction to collect the elements into a different form.
 * Example: stream.collect(Collectors.toList())
 *
 * count():
 * Usage: Returns the count of elements in the stream.
 * Example: stream.count()
 *
 * anyMatch(Predicate<T> predicate):
 * Usage: Returns true if any elements match the given predicate.
 * Example: stream.anyMatch(x -> x > 5)
 *
 * allMatch(Predicate<T> predicate):
 * Usage: Returns true if all elements match the given predicate.
 * Example: stream.allMatch(x -> x > 5)
 *
 * noneMatch(Predicate<T> predicate):
 * Usage: Returns true if no elements match the given predicate.
 * Example: stream.noneMatch(x -> x < 0)
 */
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

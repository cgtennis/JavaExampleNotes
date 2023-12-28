package java8;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        //DO NOT over use Optional
        //mainly to be used by the return type

        String input = "test"; // or null
        input = null;

        Optional<String> aMessage = Optional.ofNullable(input);
        //old way
        if(aMessage.isPresent())
            System.out.println(aMessage.get());
        else
            System.out.println("Empty");

        //better way
        System.out.println(aMessage.orElse("Empty"));
        // aMessage.orElseGet();  //pass a lambda function
        // aMessage.orElseThrow();

        Optional<Cat> optionalCat = findCatByName("Mimi");

        //A better way to use it
        int age = optionalCat.map(Cat::age)
                .orElse(0);
        System.out.println("Age = "+age);
    }

    static Optional<Cat> findCatByName(String name){
        Cat myCat = new Cat(name,5);
        return  Optional.ofNullable(myCat);

    }
}

record Cat (String name, int age) {}

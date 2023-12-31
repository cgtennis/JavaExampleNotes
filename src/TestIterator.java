import java.util.*;

public class TestIterator {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,7,9));

        //myList.forEach(System.out::println);

        //throw UnsupportedOperationException, due to myList.remove cannot be within a for loop, as it changes List size
/*        for(int i=0;i<myList.size();i++)
        {
            if(i==2)
                myList.remove(i);
            else
                System.out.println(myList.get(i));
        }*/

        //use while
        ListIterator<Integer> it = myList.listIterator();
        int i = 0;
        while(it.hasNext())
        {
            Integer next = it.next();
            if(i==2)
                it.remove();  //If use myList.remove(i), it will throw unsupportedOperationException
            else if (i==3)
                it.set(77);
            i++;

        }
        System.out.println("Size ="+ myList.size());
        myList.forEach(System.out::println);


    }
}

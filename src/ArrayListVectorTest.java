import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListVectorTest {

    public static void main(String[] args) throws InterruptedException {

        int size = 1000000;

/*        List<Integer> myList = new ArrayList<>();

        Long startTime = System.currentTimeMillis();

        for(int i=0;i<size;i++)
            myList.add(i);
        Long stopTime = System.currentTimeMillis();
        System.out.println("ArrayList size: "+ myList.size());
        System.out.println("ArrayList Duration (milli-seconds): "+(stopTime-startTime));


        List<Integer> myVectorList = new Vector<>();

        startTime = System.currentTimeMillis();

        for(int i=0;i<size;i++)
            myVectorList.add(i);
        stopTime = System.currentTimeMillis();
        System.out.println("Vector size: "+ myVectorList.size());
        System.out.println("Vector Duration (milli-seconds): "+(stopTime-startTime));*/

        Vector<Integer> myVectorList = new Vector<>();
        //multi threads
        Long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            for(int i=0;i<size;i++)
                myVectorList.add(i);
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0;i<size;i++)
                myVectorList.add(i);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        Long stopTime = System.currentTimeMillis();
        System.out.println("Vector (multithreads) size: "+ myVectorList.size());
        System.out.println("Vector  (multithreads) Duration (milli-seconds): "+(stopTime-startTime));


        List<Integer> myList = Collections.synchronizedList(new ArrayList<>());

        //multi threads
        startTime = System.currentTimeMillis();
        Thread thread3 = new Thread(() -> {
            for(int i=0;i<size;i++)
                myList.add(i);
        });
        Thread thread4 = new Thread(() -> {
            for(int i=0;i<size;i++)
                myList.add(i);
        });
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();
        stopTime = System.currentTimeMillis();
        System.out.println("ArrayList (multithreads) size: "+ myList.size());
        System.out.println("ArrayList  (multithreads) Duration (milli-seconds): "+(stopTime-startTime));



    }
}

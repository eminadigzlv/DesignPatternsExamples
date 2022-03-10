package patterns.behavioral.iterator;

import java.util.List;
import java.util.Random;

public class DataMain {

    public static void main(String[] args) {

        Data<Integer> data = new Data<>();
        int value;

        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            value=random.nextInt(10000);
            data.add(value);
        }
         // List<Integer> endData = data.getData();
        //  endData.forEach(System.out::println);
        //System.out.println(" or ");
        //System.out.println(data.getData());
        DataIterator<Integer> dataIterator= data.doiterator();
        while (dataIterator.hashNext()){
            int valuee = dataIterator.next();
            System.out.println(valuee);
        }


    }
}

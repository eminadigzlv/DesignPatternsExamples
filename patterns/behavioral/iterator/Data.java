package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Data<T>{

    private List<T> data;

    public Data() {
        this.data = new ArrayList<>();
    }

    public void  add(T element){
        data.add(element);
    }
    public void  remove(T element)
    {
        data.remove(element);
    }

   // public List<T> getData() {
   //     return data;
   //}


    // public void setData(List<T> data) {
   //     this.data = data;
   //}
        DataIterator<T> doiterator(){
        Iterator<Integer> iteratorr= (Iterator<Integer>) data.iterator();
        DataIterator<T> iterator= new DataIterator<T>() {
            @Override
            public boolean hashNext() {
                return iteratorr.hasNext();
            }

            @Override
            public T next() {
                return (T) iteratorr.next();
            }
        };
        return  iterator;
    }
}

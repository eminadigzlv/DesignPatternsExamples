package patterns.behavioral.iterator;

public interface DataIterator <T>{
    boolean hashNext();
    T next();
}

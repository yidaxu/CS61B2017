package synthesizer;

import java.util.Iterator;

/**
 * Created by yidaxu on 3/26/17.
 */
public interface BoundedQueue<T> extends Iterable<T> {
    int capacity();       // return size of the buffer
    int fillCount();      // return number of items currently in the buffer
    void enqueue(T x);    // add item x to the end
    T dequeue();          // delete and return item from the front
    T peek();             // return(but do not delete) item from the front
    Iterator<T> iterator();
    default boolean isEmpty(){
        return this.fillCount() == 0;  // return the appropriate answer if the BoundedQueue is empty
    }

    default boolean isFull(){

        return  this.fillCount() == this.capacity(); // return the appropriate answer if the BounderQueue is full
    }

}

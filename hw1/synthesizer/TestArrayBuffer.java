package synthesizer;
import edu.princeton.cs.introcs.StdAudio;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by yidaxu on 3/26/17.
 */
public class TestArrayBuffer {
    @Test
    public void test(){
        ArrayRingBuffer<Double> a = new ArrayRingBuffer<Double>(4);
        a.enqueue(33.1);
        a.enqueue(44.8);
        a.enqueue(62.3);
        a.enqueue(-3.4);
        boolean expected = true;
        boolean isFull = a.isFull();
        assertEquals(expected,isFull);

    }
    public static void main(String[] args){

        jh61b.junit.textui.runClasses(TestArrayBuffer.class);

    }
}



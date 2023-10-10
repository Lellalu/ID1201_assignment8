package se.kth.id1201;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueArrayTest
{
    @Test
    public void addRemove1Test()
    {
        QueueArray<Integer> q = new QueueArray<Integer>(1);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        assertEquals( 1, q.remove().intValue());
        assertEquals( 2, q.remove().intValue());
        assertEquals( 3, q.remove().intValue());
        assertEquals( 4, q.remove().intValue());
        assertEquals( 5, q.remove().intValue());
    }

    @Test
    public void addRemove2Test()
    {
        QueueArray<Integer> q = new QueueArray<Integer>(1);
        q.add(1);
        q.add(2);
        assertEquals(1, q.remove().intValue());
        q.add(3);
        assertEquals(2, q.remove().intValue());
        q.add(4);
        q.add(5);
        assertEquals( 3, q.remove().intValue());
        assertEquals( 4, q.remove().intValue());
        assertEquals( 5, q.remove().intValue());
    }
}
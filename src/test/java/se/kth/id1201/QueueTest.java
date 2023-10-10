package se.kth.id1201;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueTest
{
    @Test
    public void nodeQueueTest()
    {
        Queue<Integer> q = new Queue<Integer>();
        q.add(1);
        q.add(2);
        assertEquals(q.remove().intValue(), 1);
        q.add(3);
        assertEquals(q.remove().intValue(), 2);
        assertEquals(q.remove().intValue(), 3);
    }
}

package CP1Execute;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by 10235 on 2017/7/16.
 */
public class QueueExecute {
    public static void main(String[] args) {


        //队列
        Queue<Integer> queue=new LinkedList<Integer>();
        int qLneg=queue.size();
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();//非线程安全

        PriorityBlockingQueue<Integer> priorityBlockingQueue=new PriorityBlockingQueue<Integer>();//线程安全

        Deque<Integer> deque=new ArrayDeque<Integer>();//1.6后特性 双端队列
        deque.addFirst(10);
        deque.removeFirst();
    }
}

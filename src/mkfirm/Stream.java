/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mkfirm;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Aluno
 */
public class Stream {
    private Queue<Customer> queue = new LinkedList<Customer>();

    /**
     * @return the queue
     */
    public Queue<Customer> getQueue() {
        return queue;
    }

    /**
     * @param queue the queue to set
     */
    public void setQueue(Queue<Customer> queue) {
        this.queue = queue;
    }
}

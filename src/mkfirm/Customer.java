/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mkfirm;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Customer {
    private Date arrivalTime;
    private Date deadline;

    /**
     * @return the arrivalTime
     */
    public Date getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the deadline
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author tmueller2
 */
public class Customer {
    private int custID;
    private String custFirstName;
    private String custLastName;

    //constructor
    public Customer (int custID, String custFirstName, String custLastName){
        this.custID = custID;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
    }
    
    /**
     * @return the custFirstName
     */
    public String getCustFirstName() {
        return custFirstName;
    }

    /**
     * @param custFirstName the custFirstName to set
     */
    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    /**
     * @return the custLastName
     */
    public Stri
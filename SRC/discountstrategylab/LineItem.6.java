/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author tmueller2
 */
public class Receipt {

    //private final int numCust = 3;
    private Customer[] customerArray = {new Customer(1, "John", "Doe"),new Customer(1, "James", "Lombardo"), new Customer(3, "Todd","Mueller")};
    //private Customer [] customerArray = new Customer[3];
    private Customer customer;
    private LineItem [] lineItems;// = new LineItem[0];
    pri
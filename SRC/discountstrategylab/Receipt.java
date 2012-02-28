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
    private double saleTotal;
    private double subTotal;
    
    
//    customerArray [0] = new Customer(1, "John", "Doe");
//    customerArray[1] = new Customer(1, "James", "Lombardo");
//    customerArray[2] = new Customer(3, "Todd", "Mueller");
    public Receipt(String customerId){
        lineItems = new LineItem[0];
        customer = findCustomerById(customerId);
    }
    
    private Customer findCustomerById(String customerId){
        Customer customer = null;
        for(Customer c : customerArray){
            if(customerId.equals(c.getCustID())){
                customer = c;
                break;
            }
        }
        return customer;
    }
    
    publi
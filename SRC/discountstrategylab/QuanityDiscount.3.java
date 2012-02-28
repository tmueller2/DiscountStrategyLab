/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author tmueller2
 */
public class QuanityDiscount implements DiscountStrategy {

//    private int qty;
    private double price;
    
    //constructor
//    public QuanityDiscount (int qty, double price){
//        this.qty = qty;
//        this.price = price;
//    }
    
    @Override
    public double getDiscount(int qty, double price) {
        if (qty > 5){
            return ((price * .25)*qty);
        }
        else return(0);
    }

    /**
     * @return the qty
     */
//    public int getQty() {
//        return qty;
//    }

    /**
     * @param qty the qty to set
     */
//    public void setQty(int qty) {
//        this.qty = qty;
//    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author tmueller2
 */
public class ChristmasDiscount implements DiscountStrategy {

    //private int qty;
    private double price;
    
    //Amount of discount for Christmas
    private static double christmasDisc = .30;
    
    //constructor
//    public ChristmasDiscount(int qty, double price){
//        this.qty = qty;
//        this.price = price;
//    }
    
    
    @Override
    public double getDiscount(int qty, double price) {
        return ((price * christmasDisc)*qty);

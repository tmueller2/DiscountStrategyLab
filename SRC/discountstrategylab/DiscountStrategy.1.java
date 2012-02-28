/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author tmueller2
 */
public interface DiscountStrategy {
    public abstract double getDiscount(int qty, double price);
    
}

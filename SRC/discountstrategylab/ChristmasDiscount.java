/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author tmueller2
 */
public class Product {
    private DiscountStrategy discountStrategy;
    private String productID;
    private String description;
    private double unitCost;
    
    //constructor 
    public Product(DiscountStrategy discountStrategy, String productID, String description, double unitCost){
        this.discountStrategy = discountStrategy;
        this.productID = productID;
        this.description = description;
        this.unitCost = unitCost;
    }

    public double getDiscountAmount(int qty) {
        return discountStrategy.getDiscount(qty,unitCost);
    }

    /**
     * @return the discountStrategy
     */
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    /**
     * @param discountStrategy the discountStrategy to set
     */
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /**

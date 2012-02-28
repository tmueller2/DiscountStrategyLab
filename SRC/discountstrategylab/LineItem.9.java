/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategylab;

/**
 *
 * @author tmueller2
 */
public class LineItem {

    private Product product;
    private int quanity;
    //private double discountAmt;
    
    //setting product information and quanity discount associated with the product
    private Product[] productData = {new Product( new NoDiscount(), "S632", "Mitsubishi AF2/3 Power Feeder", 110.00),
        new Product(new ChristmasDiscount(), "C101", "Charmilles .010  Diamond Guide", 220.25),
        new Product(new QuanityDiscount(), "A058", "Mitsubishi .008 Upper Diamond Guide", 389.00)
    };
    

    //constructor
    public LineItem (String productId, int quanity){
        this.quanity = quanity;
        product = findProductById(productId);
        
    }
    
    public String getLineItemData(){
        return (product.getProductID() + "  " + product.getDescription());
    }
    
    
    
    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the quanity
     */
    public int getQuanity() {
        return quanity;
    }

    /**
     * @param quanity the quanity to set
     */
    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    /**
     * @return the discountAmt
     */
    public double getDiscountAmt() {
        return product.getDiscountAmount(quanity);
    }

   private Product findProductById(String productId) {
        Product product = null;
        for(Product p : productData){
            if(productId.equals(p.getProductID())){
                product = p;
                break;
            }
        }
        return product;
    }
   
    
    
    
    
    
}

/** Required package class namespace */
package doggonefunpetshop;
 
/**
 * Sale.java - creats a sale for the order
 *
 * @author Neal Dzisiak
 * @since May 1, 2024, 8:27:56 a.m.
 */
public class Sale <T> extends Order 
{

    private T saleItem;
    
    // the pice of the item
    private double price;
    
    /**
     * 
     * this is a constructor, it sets the values
     * 
     * @param saleItem info about the sale item
     * @param orderNumber the ordernumber of a dog
     */
    public Sale(T saleItem,int orderNumber){
        
        
        super.orderNumber = orderNumber;
        
        this.saleItem = saleItem;
        
    }

    /**
     * 
     * sets the price to what ever "price" is
     * 
     * @param price the price
     */
    @Override
    public void setPrice(double price) {
        
        // makes the price set to price
        this.price = price;
        
    }

    /**
     * 
     * gives the program the new price
     * 
     * @return the price
     */
    @Override
    public double getPrice() {
        
        // returms the price
        return price;
        
    }
    
    /**
     * 
     * gives the program the order number
     * 
     * @return the order number
     */
    public int getOrderNumber (){
        
        // returms the ordernumber
        return super.orderNumber;
    }
    
}
/** Required package class namespace */
package doggonefunpetshop;
 
/**
 * Order.java - an abstract class that creates everything needed 
 * to create an order
 *
 * @author Neal Dzisiak
 * @since May 14, 2024, 9:24:11 a.m.
 */
public abstract class Order 
{
    // the order number of the poodle
    protected int orderNumber;
    
    // a method that sets the price
    public abstract void setPrice(double price);
        
    // a method that returns a price
    public abstract double getPrice();
          
}
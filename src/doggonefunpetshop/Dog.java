/** Required package class namespace */
package doggonefunpetshop;
 
/**
 * Dog.java - creats a dog for sale
 *
 * @author Neal Dzisiak
 * @since May 1, 2024, 8:27:09 a.m.
 */
public class Dog implements Pet
{
    // name of the dog
    private String name;
    
    // creats the property sale ( has a sale)
    private Sale sale;

    /**
     * 
     * dose nothing
     * 
     * @param name name of the dog
     */
    @Override
    public void setName(String name) {
        
        
        
    }

    /**
     * 
     * @return nothing
     */
    @Override
    public String getName() {
        
        return null;
        
    }
    
    /**
     * 
     * sells a dog
     * 
     * @param price the price of the dog
     * @param orderNumber the order number of the dog
     */
    public void sell(double price, int orderNumber){
        
        //sends the ordernumber and sale to a constructor method
        sale = new Sale(this, orderNumber);
        
        // sets the price of the sale object
        sale.setPrice(price);
        
    }

    /**
     * 
     * show the users order, the orders name, worth and order number
     * 
     */ 
    @Override
    public void sold() {
        
        // outputs the ordernumber, name, and price of a dog
        System.out.print("Order " + sale.getOrderNumber() +
        " " + name + " is worth " + sale.getPrice() + "$");
        
    }
     
    
    
}
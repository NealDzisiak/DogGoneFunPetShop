/** Required package class namespace */
package doggonefunpetshop;
 
/**
 * Poodle.java - sells a poodle and showes you the number of poodles sold
 *
 * @author Neal Dzisiak
 * @since May 1, 2024, 8:27:27 a.m.
 */
public final class Poodle extends Dog
{

    // the number of poodles sold
    private static int poodleSold;
    
    
    /**
     * 
     * sell a poodle
     * 
     * @param name the name of the poodle
     * @param orderNumber the order number of the poodle
     */
    public Poodle(String name, int orderNumber){
        
        // adds 1 to the number od poodles sold
        poodleSold++;
        
        //sends ordernumber and 99.99 to the constructor class
        super.sell(99.99, orderNumber);
        
        // sends name to a constructor method
        super.setName(name);
        
        // implements the sold method
        sold();
        
    }
     
    
    /**
     * 
     * show how many poodles we have sold
     * 
     */
    @Override
    public void sold(){
        
        super.sold();
        
        // outputs the number of poodles sold
        System.out.println(" and we have sold " +
                poodleSold + " poodles");
        
    }
    
}
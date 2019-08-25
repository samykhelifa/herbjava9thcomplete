
import java.util.*;

enum Apple {   
      Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);    
       private int price; // price of each apple    
     // Constructor   
      Apple(int p) { price = p; }    
      int getPrice() { return price; } 
}

class EnumDemo {  
      public static void main(String args[])   {    
           Apple ap;  
           List<String> ls =  new ArrayList<>(); 
           System.out.println("Here are all Apple constants:");      
      // use values()     
       Apple allapples[] = Apple.values();     
        for(Apple a : allapples)  {
          ls.add(a.toString().toUpperCase());
          System.out.println(a); }     
           System.out.println(ls);  
        
        
      // use valueOf()     
        ap = Apple.valueOf("Winesap");    
        System.out.println("ap contains " + ap);   
            
        // Display price of Winesap.     
            System.out.println("Winesap costs " + Apple.Winesap.getPrice() +   
                               " cents.\n");      
       // Display all apples and prices. 
            System.out.println("All apple prices:");    
            for(Apple a : Apple.values())       
                  System.out.println(a + " costs " + a.getPrice() +  
                                     " cents."); 

} }


import java.util.*;

enum Apple {   Jonathan, GoldenDel, RedDel, Winesap, Cortland }  

class EnumDemo2 {  
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

} }

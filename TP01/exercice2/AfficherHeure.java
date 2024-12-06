import java.util.Date; 
public class AfficherHeure { 
  
     public static void main(String[] args) { 
         Date d = new Date(); 
         System.out.print("il est " + d.getHours() + " h "); 
         System.out.print(d.getMinutes()+ " m "); 
         System.out.println(d.getSeconds() + " s"); 
     } 
 }

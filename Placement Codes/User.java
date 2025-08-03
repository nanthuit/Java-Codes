import java.util.Scanner;
public class User {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter your name:");
         String name = sc.nextLine();
     
       System.out.println("Enter number");
          int roll = sc.nextInt();
       System.out.println("Hello,"+name+"your roll no"+roll);
       sc.close();
    
    }
}

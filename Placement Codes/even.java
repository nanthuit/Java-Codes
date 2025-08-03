import java.util.Scanner;
public class even {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = s.nextInt();
        if(a%2==0){
            System.out.println("The value is Even");
        }
        else if(a%2!=0){
            System.out.println("The value is odd");
        }
        else{
            System.out.println("the value is zero");
        }
        
    }
}

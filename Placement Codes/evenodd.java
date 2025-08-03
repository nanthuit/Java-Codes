import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("The number is positive:"+a);
        }
        else if(a<0){
            System.out.println("The number is neagtive"+a);

        }
        else{
            System.out.println("The number is Zero");
        }
    }
    
}

import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String a = sc.nextLine();
        switch (a) {
            case "1":
                    System.out.println("January");
                    break;
        
            case "2":
                    System.out.println("Febrauary");
                    break;
            case "3":
                    System.out.println("March");
                    break;
            case "4":
                    System.out.println("April");
                    break;
            default:
                    System.out.println("Default");
        }
        
    }
    
}

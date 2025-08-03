public class Reverse {
    public static void main(String[] args) {
        int a=12345;
        int num=0;
        System.out.println(a);
        while(a!=0){
            int n=a%10;
            num=num+n;
            a/=10;
           
            
        }
         System.out.println("num"+num);
        
        


    }
}

public class Marks {
    public static void main(String[] args) {
        int mark = 80;
        if(mark<40){

            System.out.println("Fail" +mark);
        }
        else if(mark>40 && mark<=60){
            System.out.println("Pass" +mark);
        }
        else if(mark>60 && mark<=80){
            System.out.println("Avergae"+mark);
        }else{
            System.out.println("Excellent"+mark);
        }
    }
    
}

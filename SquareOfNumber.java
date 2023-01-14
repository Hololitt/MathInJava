package Math;

public class SquareOfNumber {
    public static void main(String[] args) {
     for(int number = 1; number<100; number++){
         int result = (int) Math.pow(2,number);
         if(Math.pow(2,number) == 1.6777216E7){
             System.out.println(result);
             break;
         }
         System.out.println(Math.pow(2,number));
     }

    }
}

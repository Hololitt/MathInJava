
public class FindTheNumberOfLengthOfCycle {
    public static void main(String[] args) {
        while(true) {
            amount(number);
            if(count==100){
                System.out.println("this number: "+number);
                System.out.println(count);
                break;
            }else{
                count = 0;
                number +=1;
                System.out.println(number);
            }
        }
    }
    public static int number = 1;
    public static int count = 0;
    public static void amount(long n){
        while(n % 2 == 0){
            n = n/2;
        }
        if(n/2 != 0){
            count += 1;
            amount(n*3+1);
        }
    }

}

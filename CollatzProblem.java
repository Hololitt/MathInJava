import java.util.Scanner;

public class CollatzProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            
            amount(scanner.nextLong());
            count = 0;
    }
    public static int count = 0;
    public static void amount(long n){
        while(n % 2 == 0){
            n = n/2;
            System.out.println("n = "+n);
        }
        if(n/2 == 0){
            System.out.println(count);
        }else{
            count += 1;
            amount(n*3+1);
        }
    }
}

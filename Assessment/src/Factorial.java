import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int factorial=factorial(number);
        System.out.println("Factorial of "+number+" is "+factorial);

        }
        static int factorial(int n){
            if(n==0||n==1){
                return 1;

            }else{
                return n*factorial(n-1);
            }

    }
}

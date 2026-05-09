import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter phrase : ");
        String phrase=scanner.nextLine();
        String reverse="";
        String originalPhrase=phrase.toLowerCase().replace(" ","");
        for(int i=originalPhrase.length()-1;i>=0;i--){

            reverse=reverse+originalPhrase.charAt(i);
        }
        if(originalPhrase.equals(reverse)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}

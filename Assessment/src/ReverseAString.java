import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=scanner.nextLine();
        System.out.println("original string :"+str);

        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);

        }
        System.out.println("reversed string is "+reverse);


    }
}

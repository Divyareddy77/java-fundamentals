import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first word :");
        String word1=scanner.nextLine();
        System.out.println("Enter second word :");
        String word2=scanner.nextLine();
        int[] count=new int[26];
        if(word2.length()!=word1.length())
            System.out.println("Not Anagram");
        for(int i=0;i<word2.length();i++){
            count[word1.charAt(i)-'a']++;
            count[word2.charAt(i)-'a']--;
            }
        boolean isAnagram=true;
            for(int i=0;i<26;i++){
            if(count[i]!=0){
                isAnagram=false;
            }

        }
            if(isAnagram){
                System.out.println(word1+" and "+word2+" are Anagrams");
            }else {
                System.out.println(word1+" and "+word2+" are not Anagrams");
            }
    }

}

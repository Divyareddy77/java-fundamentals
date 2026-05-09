import java.util.Scanner;
import java.util.SortedMap;

public class DisplayLargestSmallestNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println("Largest number : "+largest);
        System.out.println("Smallest number : "+smallest);
    }
}

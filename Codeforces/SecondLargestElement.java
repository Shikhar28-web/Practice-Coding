package Codeforces;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();  
    }
    int max = Integer.MIN_VALUE;
    int secondmax = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            secondmax = max;
            max = arr[i];
        }
        else if(arr[i]>secondmax && arr[i]<max){
            secondmax = arr[i];
        }
    }
    System.out.println(secondmax);
}
}

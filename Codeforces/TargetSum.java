package Codeforces;
import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int t = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       int l =0;          // in starting 
       int r = arr.length-1;  // in last
         int sum = 0;
         while(l<r){
             sum = arr[l]+arr[r];
             if(sum==t){
                 System.out.println(arr[l]+" "+arr[r]);
                 l++;
                 r--;
             }
             else if(sum>t){
                 r--;
             }
             else{
                 l++;
             }
         }
       
    }
}

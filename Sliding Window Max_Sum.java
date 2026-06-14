import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int k=sc.nextInt() ;
        int size=sc.nextInt() ;
        int [] arr=new int[size] ;
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt() ;}
        int sum=0 ;
        for (int i = 0; i < k; i++) {
            sum+=arr[i] ;}
        int max=sum ;
        for (int i = k; i <arr.length ; i++) {
            sum=(sum-arr[i-k])+arr[i];
            max=Math.max(max,sum) ;

        }
        System.out.println(max);





    }}

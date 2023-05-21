import java.util.Scanner;

public class ArrayRecursionPrint {
    public static void printArray(int [] arr,int ii){
        if  (ii==arr.length){
            return;
        }
        else{
            System.out.print(arr[ii]+" ");
            printArray(arr,ii+1);
        }
    }
    public static void printReverse(int [] arr,int t){
        if (t==-1){
            return;
        }
        else{
            System.out.print(arr[t]+"  ");
            printReverse(arr,t-1);
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Number of elements in array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Array here::");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array print using recursion::");
        printArray(arr,0);
        System.out.println();
        System.out.println(" Reverse Array print using recursion::");
        printReverse(arr,arr.length-1);

    }
}

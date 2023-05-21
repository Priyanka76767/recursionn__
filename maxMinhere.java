import java.util.Scanner;

public class SubarraySum {
        //recursive code to find maximum and minimum in an array
        public static int max(int[] arr, int i) {
           if (i==arr.length){
               return 0;
           }
           else{
               return Math.max(arr[i],max(arr,i+1));

           }
        }
        public static int minn(int[] arr,int i){
            if (i==arr.length){
                return Integer.MAX_VALUE;
            }
            else{
                return Math.min(arr[i],minn(arr,i+1));
            }
        }

    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum of array::"+max(arr,0));
        System.out.println("Minimum of array::"+minn(arr,0));
    }

}

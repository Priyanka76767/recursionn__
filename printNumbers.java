import java.util.Scanner;

public class printttt {
    public static void pryyTOn(int i,int ny){
        if (i>ny){
            return;
        }
        else{
            System.out.println(i);
            pryyTOn(i+1,ny);
        }

    }
    public static void pryyNto(int nn){
        if (nn==0){
            return;
        }
        else{
            System.out.println(nn);
            pryyNto(nn-1);
        }
    }
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Numbers from 1 to "+n);
        pryyTOn(1,n);
        System.out.println("Numbers from "+n+" to 1::");
        pryyNto(n);
}
}

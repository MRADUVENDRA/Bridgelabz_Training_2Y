import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]c=new int[19];
        for(int i=0;i<n;i++)c[s.nextInt()]++;
        for(int i=10;i<=18;i++)while(c[i]-->0)System.out.print(i+" ");
    }
}

import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        for(int i=0;i<n-1;i++)for(int j=0;j<n-1-i;j++)if(a[j]>a[j+1]) {
            int t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
        for(int z:a)System.out.print(z+" ");
    }
}

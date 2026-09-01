import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        for(int i=0;i<n-1;i++) {
            int m=i;
            for(int j=i+1;j<n;j++)if(a[j]<a[m])m=j;
            int t=a[i];
            a[i]=a[m];
            a[m]=t;
        }
        for(int z:a)System.out.print(z+" ");
    }
}

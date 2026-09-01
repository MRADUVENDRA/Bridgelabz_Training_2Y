import java.util.*;
class Main {
    static void h(int[]a,int n,int i) {
        int m=i,l=2*i+1,r=2*i+2;
        if(l<n&&a[l]>a[m])m=l;
        if(r<n&&a[r]>a[m])m=r;
        if(m!=i) {
            int t=a[i];
            a[i]=a[m];
            a[m]=t;
            h(a,n,m);
        }
    }
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        for(int i=n/2-1;i>=0;i--)h(a,n,i);
        for(int i=n-1;i>0;i--) {
            int t=a[0];
            a[0]=a[i];
            a[i]=t;
            h(a,i,0);
        }
        for(int z:a)System.out.print(z+" ");
    }
}

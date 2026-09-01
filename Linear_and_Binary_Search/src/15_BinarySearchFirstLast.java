import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        int t=s.nextInt(),l=0,r=n-1,f=-1,z=-1;
        while(l<=r) {
            int m=l+(r-l)/2;
            if(a[m]>=t) {
                if(a[m]==t)f=m;
                r=m-1;
            } else l=m+1;
        }
        l=0;
        r=n-1;
        while(l<=r) {
            int m=l+(r-l)/2;
            if(a[m]<=t) {
                if(a[m]==t)z=m;
                l=m+1;
            } else r=m-1;
        }
        System.out.println(f+" "+z);
    }
}

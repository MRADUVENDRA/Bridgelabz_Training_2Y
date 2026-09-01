import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        int l=0,r=n-1;
        while(l<r) {
            int m=l+(r-l)/2;
            if(a[m]>a[r])l=m+1;
            else r=m;
        }
        System.out.println(l);
    }
}

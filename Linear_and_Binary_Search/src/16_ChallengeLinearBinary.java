import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        boolean[]v=new boolean[n+2];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
            if(a[i]>0&&a[i]<=n+1)v[a[i]]=true;
        }
        int t=s.nextInt(),m=1;
        while(v[m])m++;
        Arrays.sort(a);
        int l=0,r=n-1,ans=-1;
        while(l<=r) {
            int q=l+(r-l)/2;
            if(a[q]==t) {
                ans=q;
                break;
            }
            if(a[q]<t)l=q+1;
            else r=q-1;
        }
        System.out.println(m);
        System.out.println(ans);
    }
}

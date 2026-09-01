import java.util.*;
class Main {
    static void sort(int[]a) {
        if(a.length<2)return;
        int m=a.length/2;
        int[]l=Arrays.copyOfRange(a,0,m),r=Arrays.copyOfRange(a,m,a.length);
        sort(l);
        sort(r);
        int i=0,j=0,k=0;
        while(i<l.length&&j<r.length)a[k++]=l[i]<r[j]?l[i++]:r[j++];
        while(i<l.length)a[k++]=l[i++];
        while(j<r.length)a[k++]=r[j++];
    }
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        sort(a);
        for(int z:a)System.out.print(z+" ");
    }
}

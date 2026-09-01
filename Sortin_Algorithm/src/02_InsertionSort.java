import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        for(int i=1;i<n;i++) {
            int k=a[i],j=i-1;
            while(j>=0&&a[j]>k) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
        for(int z:a)System.out.print(z+" ");
    }
}

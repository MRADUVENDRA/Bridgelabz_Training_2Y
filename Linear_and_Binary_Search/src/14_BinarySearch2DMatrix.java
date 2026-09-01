import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        int[][]a=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=s.nextInt();
        int t=s.nextInt(),l=0,h=r*c-1;
        while(l<=h) {
            int m=l+(h-l)/2,v=a[m/c][m%c];
            if(v==t) {
                System.out.println(true);
                return;
            }
            if(v<t)l=m+1;
            else h=m-1;
        }
        System.out.println(false);
    }
}

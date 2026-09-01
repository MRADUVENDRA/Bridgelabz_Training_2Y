import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),ans=-1;
        for(int i=0;i<n;i++) {
            int v=s.nextInt();
            if(v<0&&ans==-1)ans=i;
        }
        System.out.println(ans);
    }
}

import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        StringBuffer b=new StringBuffer();
        for(int i=0;i<n;i++)b.append(s.next());
        System.out.println(b);
    }
}

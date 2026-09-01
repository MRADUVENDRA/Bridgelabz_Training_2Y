import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        String[]a=new String[n];
        for(int i=0;i<n;i++)a[i]=s.nextLine();
        String w=s.nextLine();
        for(String z:a)if(Arrays.asList(z.split("\\s+")).contains(w)) {
            System.out.println(z);
            return;
        }
        System.out.println("Not Found");
    }
}

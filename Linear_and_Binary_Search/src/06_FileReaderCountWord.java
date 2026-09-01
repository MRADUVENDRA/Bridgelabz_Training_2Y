import java.io.*;
import java.util.*;
class Main {
    public static void main(String[]x)throws Exception {
        Scanner s=new Scanner(System.in);
        String f=s.nextLine(),w=s.nextLine(),l;
        int c=0;
        BufferedReader b=new BufferedReader(new FileReader(f));
        while((l=b.readLine())!=null)for(String z:l.split("\\s+"))if(z.equals(w))c++;
        b.close();
        System.out.println(c);
    }
}

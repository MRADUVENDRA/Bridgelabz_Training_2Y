import java.io.*;
import java.util.*;
class Main {
    public static void main(String[]x)throws Exception {
        Scanner s=new Scanner(System.in);
        BufferedReader b=new BufferedReader(new FileReader(s.nextLine()));
        String l;
        while((l=b.readLine())!=null)System.out.println(l);
        b.close();
    }
}

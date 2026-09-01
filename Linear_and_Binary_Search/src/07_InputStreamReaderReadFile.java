import java.io.*;
import java.nio.charset.*;
import java.util.*;
class Main {
    public static void main(String[]x)throws Exception {
        Scanner s=new Scanner(System.in);
        BufferedReader b=new BufferedReader(new InputStreamReader(new FileInputStream(s.nextLine()),StandardCharsets.UTF_8));
        String l;
        while((l=b.readLine())!=null)System.out.println(l);
        b.close();
    }
}

import java.io.*;
import java.nio.charset.*;
import java.util.*;
class Main {
    static int c(BufferedReader b)throws Exception {
        int n=0;
        String l;
        while((l=b.readLine())!=null&&!l.isEmpty())n+=l.trim().split("\\s+").length;
        return n;
    }
    public static void main(String[]x)throws Exception {
        long t=System.nanoTime();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<1000000;i++)a.append("hello");
        System.out.println(System.nanoTime()-t);
        t=System.nanoTime();
        StringBuffer d=new StringBuffer();
        for(int i=0;i<1000000;i++)d.append("hello");
        System.out.println(System.nanoTime()-t);
        Scanner s=new Scanner(System.in);
        String f=s.nextLine();
        t=System.nanoTime();
        BufferedReader b=new BufferedReader(new FileReader(f));
        System.out.println(c(b));
        b.close();
        System.out.println(System.nanoTime()-t);
        t=System.nanoTime();
        b=new BufferedReader(new InputStreamReader(new FileInputStream(f),StandardCharsets.UTF_8));
        System.out.println(c(b));
        b.close();
        System.out.println(System.nanoTime()-t);
    }
}

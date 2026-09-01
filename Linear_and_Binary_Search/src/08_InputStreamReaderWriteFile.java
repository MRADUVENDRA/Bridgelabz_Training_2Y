import java.io.*;
class Main {
    public static void main(String[]x)throws Exception {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        FileWriter f=new FileWriter("output.txt");
        String l;
        while(!(l=b.readLine()).equals("exit"))f.write(l+"\n");
        f.close();
    }
}

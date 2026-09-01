import java.util.*;
class Main {
    public static void main(String[]x) {
        Scanner s=new Scanner(System.in);
        String t=s.nextLine(),r="";
        for(char c:t.toCharArray())if(r.indexOf(c)==-1)r+=c;
        System.out.println(r);
    }
}

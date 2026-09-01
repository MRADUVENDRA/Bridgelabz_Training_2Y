class Main {
    public static void main(String[]x) {
        long t=System.nanoTime();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<1000000;i++)a.append("hello");
        System.out.println("StringBuilder: "+(System.nanoTime()-t));
        t=System.nanoTime();
        StringBuffer b=new StringBuffer();
        for(int i=0;i<1000000;i++)b.append("hello");
        System.out.println("StringBuffer: "+(System.nanoTime()-t));
    }
}

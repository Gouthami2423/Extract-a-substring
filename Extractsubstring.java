public class Extractsubstring {
    public static void main(String[] args) {
        String mainString="hello,world";
        int startindex=7;
        int endindex=11;
        String substring=mainString.substring( startindex,endindex);
        System.out.println("extracted substring:" + substring);
    }
}

public class MainTry {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        switch(x) {
            case x < 1:
                System.out.println("SMALLER");
                break;
            case x > 1:
                System.out.println("BIGGER");
            default:
                System.out.println("EQUAL");
                break;
        }
        int newIntX = 78;
    }
}
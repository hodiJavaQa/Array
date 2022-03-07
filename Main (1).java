import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean c = isCharInString("hodi","o");
        System.out.println(c);
        double x=scanner.nextDouble();
        double yauza =scanner.nextDouble();
        double res= div(x,yauza);
        System.out.println(res);
    }
    public static boolean isCharInString(String str,String ch){
        if(str.contains(ch)) {
            return true;
        }
        else return false;
    } //5

    public static double add(double x,double y ) {
        return x + y;
    }
    public static double sub(double x,double y ) {
        return x - y;
    }
    public static double mult(double x,double y ) {
        return x * y;
    }
    public static double div(double x,double y ) {
        return x / y;
    }

}

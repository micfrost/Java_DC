package D20_Methods.D20_T1_ArithmeticCalculator;

public class Main {
    public static void main(String[] args) {

        ArithmeticCalculator arithOper = new ArithmeticCalculator();

        double add1 = arithOper.add(4, 5);
        System.out.println(add1);

        double sub1 = arithOper.subtract(8, 10);
        System.out.println(sub1);

        double mult1 = arithOper.multiply(12, 15);
        System.out.println(mult1);

        double divi1 = arithOper.divide(16, 20);
        System.out.println(divi1);

    }
}

package pro.mixme.arithmetic;

public class SimpleOperation {

    public static void main(String[] args) {

        // Деление на целый 0  ->  ArithmeticException
            // int summ = 1/0;

        // Деление на 0 с плавающей точкой  ->  PositiveInfinity
            // double summ = 1/0.;
            // System.out.println(summ);

        // 0 разделить на 0  ->  NaN (Not a Number)
            double summ = 0/0.;
            System.out.println(summ);

    }

}

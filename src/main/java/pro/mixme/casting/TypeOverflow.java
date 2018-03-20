package pro.mixme.casting;

public class TypeOverflow {

    public static void main(String[] args) {

        // Явное приведение типов
        int i = 9;
        byte b = (byte) i;
        System.out.println("int = 9 to byte >  " + b);

        int ii = 400;
        byte bb = (byte) ii;
        System.out.println("int = 400 to byte >  " + bb);

        int iii = 130;
        byte bbb = (byte) iii;
        System.out.println("int = 130 to byte >  " + bbb);

        // Неявное приведение типов
        int big = 1000;
        byte small = 7;
        System.out.println("\nSumm int=1000 + byte=7 cast to int >  " + (big+small));

    }

}

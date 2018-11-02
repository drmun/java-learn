package pro.mixme.generics;

public class Autoboxing<T> {

    private T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }


    // Main
    public static void main(String[] args) {

        Autoboxing<String> generic = new Autoboxing<String>();
        generic.setT("String 1");
            System.out.println(generic.getT());
        generic.setT("String 2");
            System.out.println(generic.getT());

        Autoboxing withoutGeneric = new Autoboxing();
        withoutGeneric.setT("String 3");
            System.out.println(withoutGeneric.getT() + " : " + withoutGeneric.getT().getClass().getTypeName());
        withoutGeneric.setT(4);     // autoboxing
            System.out.println(withoutGeneric.getT() + " : " + withoutGeneric.getT().getClass().getTypeName());

    }


}

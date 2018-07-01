package hliu.java;

public class Main {

    public static void main(String[] args) {
        Datatypes dy = new Datatypes();
        dy.getAttr();
        dy.printAsString();
        dy.cast();

        UserInOut ios = new UserInOut();
        ios.in(args);

        MathLib ml = new MathLib();
        ml.basics();
    }
}


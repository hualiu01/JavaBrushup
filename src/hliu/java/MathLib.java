package hliu.java;

public class MathLib {
    public void basics()
    {
        Math.abs(-234);
        Math.max(2,3);
        Math.min(2,3);
        System.out.println(Math.floor(-2.445));//-3.0
        System.out.println(Math.round(5.645));// 6
        System.out.println(Math.round(-5.645));// -6

        System.out.println((int)(Math.random() * 10)); // [0,10)
    }
}

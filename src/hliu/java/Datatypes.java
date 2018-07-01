package hliu.java;

public class Datatypes {
    static String randomString = "hua" + "liu";
    static final double CONSTVAR = 3.14;

    byte minB = -128, maxB = 127; //1Byte -2^7 2^7-1
    short minS = -32768, maxS = 32767; //2Bytes
    int minI = -2147483648, maxI = 2147483647; //4Bytes
    long minL = -9223372036854775808L, maxL = 9223372036854775807L; // end with L

    float endWithF = 3.14F;
    double d = 3.4564567;

    public void printAsString() {
        char ch1 = 66, ch2 = 'A';
        System.out.println(ch1); // 'B'
        System.out.println(ch2);
        System.out.println(ch1 + ch2); // 131

        boolean b1 = true;// this wont compile: b2 = 0, b3 = 1;
        System.out.println(b1); // true

        String byteStr = Byte.toString(minB);
        String doubleStr = Double.toString(d);
        String intStr = Integer.toString(minI);
        System.out.println(byteStr + "|" + doubleStr + "|" + intStr);
    }

    public void cast()
    {
        double hugeD = 3000000000000.123232;
        int castedInt = (int) hugeD;
        System.out.println(castedInt); // 2147483647
    }


    public void getAttr()
    {
        System.out.println(Float.MAX_VALUE); // 3.4028235E38
        System.out.println(Float.TYPE); // float
        System.out.println(Float.BYTES); // 4
    }
}

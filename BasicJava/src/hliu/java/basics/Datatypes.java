package hliu.java.basics;

public class Datatypes {
	static String randomString = "hua" + "liu";
	static final double CONSTVAR = 3.14;
	
	
	byte minB = -128, maxB = 127; //1Byte -2^7 2^7-1
	short minS = -32768, maxS = 32767; //2Bytes
	int minI = -2147483648, maxI = 2147483647; //4Bytes
	long minL = -9223372036854775808L, 
		 maxL = 9223372036854775807L; // end with L
	
	float endWithF = 3.14F;
	double d = 3.4564567;
	
	public static void main(String[] args)
	{
		System.out.println("Java Brushup!");
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.TYPE);
		System.out.println(Float.BYTES);
	}
}

package hliu.java;

import java.util.Scanner;

public class UserInOut {

    static Scanner userInput = new Scanner(System.in);

    public static void in(String[] args)
    {
        System.out.println("Input args:");
        if(userInput.hasNextInt())
        {
            int numIn = userInput.nextInt();
            System.out.println("Input integer: " + numIn);
        }

        if(userInput.hasNextLine())
        {
            String in = userInput.nextLine();
            System.out.println("rest in the line: " + in);
        }
    }
}

//Task B
//Matthew Yeung
//CS1400
//Assignment 4
//10-08-2023
import java.io.File;
import java.io.IOException;
//import java.io.PrintWriter;
//PrintWriter fileX
import java.util.Scanner;

public class TaskB{
    public static void main(String[] args)  throws IOException
        {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter file name: ");
            String filename = keyboard.nextLine();
            
            File Code = new File(filename);
            Scanner inputCode = new Scanner(Code);

            int linecount = 1;
                while (inputCode.hasNext())
                {
                    String CodeInput = inputCode.nextLine();
                    System.out.println("Line " + linecount + ": " + CodeInput + "\n");
                    linecount++;
                }
            inputCode.close();
            }
        }
}

//Task D
//Matthew Yeung
//CS1400
//Assignment 4
//10-08-2023
import java.util.Scanner;
public class TaskD{
    public static void main(String[] args){
        int position;
        Scanner keyboard = new Scanner(System.in);
        position = keyboard.nextInt();
        switch (position) {
        case 1:
            System.out.println("You won!");
            break;
        case 2:
            System.out.println("You were so close!");
            break;
        case 3:
            System.out.println("You were so close!");
            break;
        default:
            System.out.println("Time to train harder!");
            break;
        }
    }
}

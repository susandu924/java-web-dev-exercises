package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("What is the width of the rectangle: ");
        int width = input.nextInt();
//Use the length and width values to calculate the rectangle’s area.
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);

//        Print a statement using concatenation to communicate to the user what the area of their rectangle is.
//
//Run the program to verify your code.


    }
}
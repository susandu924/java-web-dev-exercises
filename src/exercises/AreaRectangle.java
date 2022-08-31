package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        AreaRectangle areaOfRectangle = new AreaRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }
    public void calculateAreaOfRectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle: ");
        Double length = input.nextDouble();
        System.out.println("What is the width of the rectangle: ");
        Double width = input.nextDouble();
//Use the length and width values to calculate the rectangle’s area.
        Double area = length * width;
        System.out.println("The area of the rectangle is " + area.toString());

//        Print a statement using concatenation to communicate to the user what the area of their rectangle

    }
}
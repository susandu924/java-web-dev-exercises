package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args){
        ArrayPractice arrayPractice = new ArrayPractice();
//        arrayPractice.printOdds();
//        arrayPractice.splitString();
          arrayPractice.splitStringSentences();
    }
    public void printOdds(){
        int[] myArray ={1,1,2,3,5,8};
        for(int i =0; i < myArray.length; i++){
            if (myArray[i] % 2 == 1) {
//                total += i;
//                return total;

                System.out.println(myArray[i]);
            }
        }
    }
    public String[] splitString(){
        String fox = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] mySplitString = fox.split(" ");
        //System.out.println(Arrays.toString(mySplitString));
        return mySplitString;
    }
    public  void splitStringSentences(){
        String fox = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] mySplitString = fox.split("\\.");
        System.out.println(Arrays.toString(mySplitString));
    }
}

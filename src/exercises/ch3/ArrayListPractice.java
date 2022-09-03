package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
//        ArrayList<Integer> numbersToSum = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        Integer theSum = ArrayListPractice.sumOfEvens(numbersToSum);
//        System.out.println("The sum is : "+ theSum.toString());

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitString();

        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("What word length are you looking for: ");
        Integer searchLength =ArrayListPractice.getUserSearchInput();
        ArrayListPractice.fiveLetters(wordsToSearch, searchLength);

//        numbersToSum.add(1);
//        numbersToSum.add(1);
//        numbersToSum.add(1);
    }

public static Integer sumOfEvens(ArrayList<Integer> sumOfNumbers){
        Integer sum = 0;
        for(int i =0; i < sumOfNumbers.size(); i++) {
            if (sumOfNumbers.get(i) % 2 == 0) {
                sum = sum + sumOfNumbers.get(i);
//                sum+= sumOfNumbers.get(i);
//                System.out.println(sumOfNumbers.get(i));
            }
        }
        return sum;
    }
    public static String fiveLetters(ArrayList<String>words, Integer searchLength){
        for(int i =0; i < words.size(); i++){
            if(words.get(i).length() == searchLength)
            System.out.println(words.get(i));
        }
        return null;
    }
    public static Integer getUserSearchInput(){
        Scanner scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();
        scanner.close();
        return userInput;
    }
}

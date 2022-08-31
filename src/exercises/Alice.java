package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Alice myFirstAlice = new Alice();
        String searchTerm = myFirstAlice.getUsersSearchTerm();
        Boolean myReturnedResult = myFirstAlice.searchAlice(searchTerm);
        if (myReturnedResult = true){
            myFirstAlice.getWordsIndex(searchTerm);
            myFirstAlice.removeWordFromQuote(searchTerm);
        }
        System.out.println("The result is: " + myReturnedResult.toString());

    }
    public void removeWordFromQuote(String searchTerm){
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceQuoteLowercase = aliceQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        Boolean result = aliceQuoteLowercase.contains(searchTermLowerCase);
        int startingPoint1=0;
        int endingPoint1=aliceQuoteLowercase.indexOf(searchTermLowerCase);
        int startingPoint2=aliceQuoteLowercase.indexOf(searchTermLowerCase) +searchTermLowerCase.length();

        String newQuote = aliceQuote.substring(startingPoint1, endingPoint1) +aliceQuote.substring(startingPoint2);
        System.out.println("The new quote is: " + newQuote);
    }
    public void getWordsIndex(String searchTerm){
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceQuoteLowercase = aliceQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        Boolean result = aliceQuoteLowercase.contains(searchTermLowerCase);
        int theIndex = aliceQuoteLowercase.indexOf(searchTermLowerCase);
        System.out.println("The index is: " + theIndex + " and the length is: "+searchTermLowerCase.length());

    }
    public  String getUsersSearchTerm(){
        Scanner input = new Scanner(System.in);
        String searchTerm = input.nextLine();
        input.close();
        return searchTerm;
    }
    public Boolean searchAlice(String searchTerm){
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceQuoteLowercase = aliceQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        Boolean result = aliceQuoteLowercase.contains(searchTermLowerCase);
        return result;
    }

//        System.out.println("Search for a term within Alice's Adventures in Wonderland: ");
//        String updatedAlice =
//                Integer index = firstSentence.indexOf(searchTerm);
//        Integer length = searchTerm.length();
//        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
//        String modifiedSentence = firstSentence.replace(searchTerm, "");
//        System.out.println(modifiedSentence);

}
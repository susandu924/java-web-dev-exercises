package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCount = new HashMap<>();

        String phrase = "I like pie";
        char[] charactersInString = phrase.toCharArray();

        for (char unit : charactersInString) {
            int count = 0;
            characterCount.put(unit, count);
            count += 1;

//        }
//            for (Map.Entry<Character, Integer>  : characterCount.entrySet()) {
//                System.out.println(characterCount.getKey() + " (" + characterCount.getValue() + ")");
            }

//            }
//         }

            System.out.println(charactersInString);
        }

    }

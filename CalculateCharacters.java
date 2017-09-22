import java.util.HashMap;
import java.util.Scanner;

public class CalculateCharacters {

    private static HashMap<Character, Integer> hashMap = new HashMap<>();


    public static String calculateDublicateCharachters(String str){
        for (int i = 0; i < str.length(); i++){
            Character character = (char) str.codePointAt(i);
            Integer frequency = hashMap.get(character);
            hashMap.put(character, frequency == null ? 1 : frequency + 1);
        }
        return hashMap.toString();
    }



}

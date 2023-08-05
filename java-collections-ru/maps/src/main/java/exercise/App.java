package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String letter){
        String[] lettersArr = letter.split(" ");
        List<String> list =  Arrays.asList(lettersArr);
        Map<String, Integer> result = new HashMap<>();
        if(letter.length() == 0){
            return result;
        }
        for(String word : list){
            int wordCount = result.getOrDefault(word, 0);
            wordCount += 1;
            result.put(word, wordCount);
        }
        return result;

    }

    public static String toString(Map<String, Integer> map){
        if(map.isEmpty()){
            return "{}";
        }
        StringBuilder result = new StringBuilder("{\n");
        for(String key : map.keySet()){
            result.append("  " + key + ": " + map.get(key) + "\n");
        }
        result.append("}");
        return result.toString();
    }
}

//END

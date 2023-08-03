package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



// BEGIN
public class App{
    public static boolean scrabble(String symbols, String word){
        String[] symbolsArr = symbols.split("");
        List<String> symbolsList = Arrays.asList(symbolsArr);
        for(int i = 0; i < word.length(); i++){
            String currentSymbol = word.substring(i, i + 1).toLowerCase();
            if(!symbolsList.contains(currentSymbol)){
                return false;
            }
            symbolsList.remove(currentSymbol);
        }
        return true;

    }

}



//END

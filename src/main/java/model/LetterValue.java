package model;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by Guest on 1/2/18.
 */
public class LetterValue {

    public static String calculatePoint(String enteredWord) {
        Pattern onePoint = Pattern.compile("['H']");
        String[] uppedWord = enteredWord.split("");
        Integer score = 0;
        for(int i = 0; i < uppedWord.length; i++){
            if(uppedWord[i].matches("(?i)['A'|'E'|'I'|'O'|'U']")){
                score = score + 1;
            } else if (uppedWord[i].matches("(?i)['D'|'G']")) {
                score = score + 2;
            } else if (uppedWord[i].matches("(?i)['B'|'C'|'M'|'P']")) {
                score = score + 3;
            } else if (uppedWord[i].matches("(?i)['F'|'H'|'V'|'W'|'Y']")) {
                score = score + 4;
            } else if (uppedWord[i].matches("(?i)['K']")) {
                score = score + 5;
            } else if (uppedWord[i].matches("(?i)['J'|'X']")) {
                score = score + 8;
            } else if (uppedWord[i].matches("(?i)['Q'|'Z]")) {
                score = score + 10;
            } else {}
        }
        return score.toString();
    }
}

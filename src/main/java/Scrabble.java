/**
 * Created by Guest on 1/2/18.
 */
import java.util.Map;

import model.LetterValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scrabble {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Scrabble word?");


        try {
            String stringScrabbleWord = bufferedReader.readLine();
            String letterValueResult = LetterValue.calculatePoint(stringScrabbleWord);

            System.out.println(letterValueResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
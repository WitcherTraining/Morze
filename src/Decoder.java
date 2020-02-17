import java.io.*;
import java.util.ArrayList;

public class Decoder {

    public void decodeToEnglishFromMorze(String text, File decodedFile) {
        ArrayList<String> morzeList = Letter.getEnglishMorze();
        ArrayList<String> alphabet = Letter.getEnglishAlphabet();

        String[] letters = text.split("/");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(decodedFile))){
            for (String symbol : letters) {
                for (int i = 0; i < morzeList.size(); i++) {
                    if (symbol.equals(morzeList.get(i))) {
                        writer.write(alphabet.get(i));
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void decodeToRussianFromMorze(String text, File decodedFile) {
        ArrayList<String> morzeList = Letter.getRussianMorze();
        ArrayList<String> alphabet = Letter.getRussianAlphabet();

        String[] letters = text.split("/");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(decodedFile))){
            for (String symbol : letters) {
                for (int i = 0; i < morzeList.size(); i++) {
                    if (symbol.equals(morzeList.get(i))) {
                        writer.write(alphabet.get(i));
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

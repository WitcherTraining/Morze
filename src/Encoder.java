import java.io.*;
import java.util.ArrayList;

public class Encoder {

    public String readFromFile(File fileToEncode) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileToEncode))) {
            String text = reader.readLine();

            while (text != null) {
                sb.append(text).append("\n");
                text = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void encodeToEnglishFromMorze(String text, File encodedFile) {
        ArrayList<String> morzeList = Letter.getEnglishMorze();
        ArrayList<String> engList = Letter.getEnglishAlphabet();
        char[] letters = text.toLowerCase().toCharArray();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(encodedFile))) {
            for (char symbols : letters) {
                for (int i = 0; i < engList.size(); i++) {
                    if (String.valueOf(symbols).equals(engList.get(i))) {
                        writer.write(morzeList.get(i) + "/");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeToRusFromMorze(String text, File encodedFile) {
        ArrayList<String> morzeList = Letter.getRussianMorze();
        ArrayList<String> rusList = Letter.getRussianAlphabet();
        char[] letters = text.toLowerCase().toCharArray();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(encodedFile))) {
            for (char symbols : letters) {
                for (int i = 0; i < rusList.size(); i++) {
                    if (String.valueOf(symbols).equals(rusList.get(i))) {
                        writer.write(morzeList.get(i) + "/");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

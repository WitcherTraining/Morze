import java.io.*;

public class TranslateRunner {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();

        File engText = new File("engText.txt");
        File encryptToMorzeFromEng = new File("encMorzeFromEng.txt");
        File decEngText = new File("decodedEngText.txt");
        File rusText = new File("rusText.txt");
        File encryptToMorzeFromRus = new File("encMorzeFromRus.txt");
        File decRusText = new File("decodedRusText.txt");

        String engTextFromFile = encoder.readFromFile(engText);
        encoder.encodeToEnglishFromMorze(engTextFromFile, encryptToMorzeFromEng);
        String engMorzeString = encoder.readFromFile(encryptToMorzeFromEng);
        decoder.decodeToEnglishFromMorze(engMorzeString, decEngText);

        String rusTextFromFile = encoder.readFromFile(rusText);
        encoder.encodeToRusFromMorze(rusTextFromFile, encryptToMorzeFromRus);
        String rusMorzeString = encoder.readFromFile(encryptToMorzeFromRus);
        decoder.decodeToRussianFromMorze(rusMorzeString, decRusText);
    }
}

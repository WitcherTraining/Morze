import java.util.ArrayList;
import java.util.Arrays;

public class Letter {
    private static final ArrayList<String> RUSSIAN_ALPHABET = new ArrayList<>();
    private static final ArrayList<String> ENGLISH_ALPHABET = new ArrayList<>();
    private static final ArrayList<String> RUSSIAN_MORZE = new ArrayList<>();
    private static final ArrayList<String> ENGLISH_MORZE = new ArrayList<>();

    static {
        String[] rusAlphabet = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к",
                "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ",
                "ы", "ь", "э", "ю", "я", " ", "\n"};
        RUSSIAN_ALPHABET.addAll(Arrays.asList(rusAlphabet));

        String[] engAlphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "\n"};
        ENGLISH_ALPHABET.addAll(Arrays.asList(engAlphabet));

        String[] rusMorze = {"•−", "−•••", "•−−", "−−•", "−••", "•", "−••−−", "•••−", "−−••", "••", "•−−−",
                "−•−", "•−••", "−−", "−•", "−−−", "•−−•", "•−•", "•••", "−", "••−", "••−•", "••••", "−•−•",
                "−−−•", "−−−−", "−−•−", "−−•−−", "−•−−", "−••−", "••−••", "••−−", "•−•−", " ", "\n"};
        RUSSIAN_MORZE.addAll(Arrays.asList(rusMorze));

        String[] engMorze = {"•−", "−•••", "−•−•", "−••", "•", "••−•", "−−•", "••••", "••", "•−−−", "−•−",
                "•−••", "−−", "−•", "−−−", "•−−•", "−−•−", "•−•", "•••", "−", "••−", "•••−", "•−−", "−••−",
                "−•−−", "−−••", " ", "\n"};
        ENGLISH_MORZE.addAll(Arrays.asList(engMorze));
    }

    public static ArrayList<String> getRussianAlphabet() {
        return RUSSIAN_ALPHABET;
    }

    public static ArrayList<String> getEnglishAlphabet() {
        return ENGLISH_ALPHABET;
    }

    public static ArrayList<String> getRussianMorze() {
        return RUSSIAN_MORZE;
    }

    public static ArrayList<String> getEnglishMorze() {
        return ENGLISH_MORZE;
    }
}

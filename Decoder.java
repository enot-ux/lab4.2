public class Decoder {
    // Method for decoding by replacing vowels
    public static String decodeVowelReplacement(String input) {
        return input.replaceAll("[aeiouAEIOU]", "12345");
    }

    // Method for decoding by replacing consonants
    public static String decodeConsonantReplacement(String input) {
        return input.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", m -> {
            char c = m.group().charAt(0);
            return String.valueOf((char) (c + 1));
        });
    }
    
    // Add other decoding methods if needed
}

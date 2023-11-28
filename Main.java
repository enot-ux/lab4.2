public class Main {
    public static void main(String[] args) {
        // An example of using a decoder
        String encodedMessage = "t2st3ng ufttjoh";
        
        // Decoding by replacing vowels
        String decodedMessageVowel = Decoder.decodeVowelReplacement(encodedMessage);
        System.out.println("Декодовано (Заміна голосних): " + decodedMessageVowel);

        // Decoding by replacing consonants
        String decodedMessageConsonant = Decoder.decodeConsonantReplacement(encodedMessage);
        System.out.println("Декодовано (Заміна приголосних): " + decodedMessageConsonant);
    }
}

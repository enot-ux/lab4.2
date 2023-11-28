import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDecoder {
    @Test
    public void testDecodeVowelReplacement() {
        assertEquals("12345", Decoder.decodeVowelReplacement("aeiouAEIOU"));
        assertEquals("h2ll4", Decoder.decodeVowelReplacement("hello"));
    }

    @Test
    public void testDecodeConsonantReplacement() {
        assertEquals("b", Decoder.decodeConsonantReplacement("a"));
        assertEquals("ufttjoh", Decoder.decodeConsonantReplacement("testing"));
    }
    
    
}

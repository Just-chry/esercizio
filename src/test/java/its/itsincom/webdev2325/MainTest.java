package its.itsincom.webdev2325;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    public void parseDoubleShouldNotWorkOnEmptyStrings() {
        try {
            long value = MainTest.parseDouble("");
            Assertions.fail("parse double non può tornare un valore con stringa vuota");

        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithNonNumericChars() {
        try {
            long value = Main.parseDouble("123a");
            Assertions.fail("Parse Int non può tornare un valore i ncaso di stringhe con caratteri non numerici");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithIntegers() {
        try {
            long value = Main.parseDouble("50");
            Assertions.assertEquals(50, value);
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorthWithNull() {
        try {
            long value = Main.parseDouble(null);
            Assertions.fail("Parse Int non può tornare un valore in caso di stringhe con null");
        } catch (NullPointerException e) {

        }
    }
}

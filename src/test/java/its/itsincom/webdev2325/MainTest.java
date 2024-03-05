package its.itsincom.webdev2325;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class MainTest {
    @Test
    public void parseDoubleShouldNotWorkOnEmptyStrings() {
        try {
            double value = Main.parseDouble("");
            Assertions.fail("parse double non può tornare un valore con stringa vuota");

        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithNonNumericChars() {
        try {
            double value = Main.parseDouble("123a");
            Assertions.fail("Parse Int non può tornare un valore i ncaso di stringhe con caratteri non numerici");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithIntegers() {
        try {
            double value = Main.parseDouble("50");
            Assertions.assertEquals(50, value);
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorthWithNull() {
        try {
            double value = Main.parseDouble(null);
            Assertions.fail("Parse Int non può tornare un valore in caso di stringhe con null");
        } catch (NullPointerException e) {

        }

    }

    @Test
    public void parseIntShouldNotWorkWithZero() {
        try {
            double value = Main.parseDouble("0");
            Assertions.assertEquals(0, value);
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithMinusInRandomPlaces() {
        try {
            double value = Main.parseDouble("123-45");
            Assertions
                    .fail("Parse Double non può tornare un valore in caso di stringhe con - in posizioni non corrette");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void parseDoubleShouldWorkWithDecimalStrings() {
        try {
            double value = Main.parseDouble("50.5");
            Assertions.assertEquals(50.5, value);
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldWorkWithNegativeDecimalStrings() {
        try {
            double value = Main.parseDouble("-50.5");
            Assertions.assertEquals(-50.5, value);
        } catch (IllegalArgumentException e) {
        }
    }

}

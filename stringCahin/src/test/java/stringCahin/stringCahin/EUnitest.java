package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EUnitest {
    @Test
    public void testBAddsOnlyBAndSendsCorrectPrefixToC() {
        // Arrange
        E e = new E();

        // Act
        String result = e.process("");

        // Assert
       

        // 2. B must return whatever C returns ("BX" from the stub)
        assertEquals("O", result);
    }

}

package chapter3;

import static org.junit.Assert.*;
import org.junit.Test;
import tools.Tools;

public class Exercise15Test {

    @Test
    public void testDrawSecretNumberReturnThreeDigits() {
        Lotto lotto = new Lotto(3);
        lotto.drawSecretNumber();
        assertTrue(lotto.getSecretNumber()[0] < 10
                && lotto.getSecretNumber()[0] > 0);
        assertTrue(lotto.getSecretNumber()[1] < 10
                && lotto.getSecretNumber()[1] > 0);
        assertTrue(lotto.getSecretNumber()[2] < 10
                && lotto.getSecretNumber()[2] > 0);
    }
}

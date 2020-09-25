package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int testNumber = 0;
        int result = new GettingStarted().addFive(testNumber);
        Assertions.assertEquals(testNumber + 5, result);
    }
//
    @Test
    public void addFiveToMinus20() {
        int testNumber = -20;
        int result = new GettingStarted().addFive(testNumber);
        Assertions.assertEquals(testNumber + 5,result);
    }
}

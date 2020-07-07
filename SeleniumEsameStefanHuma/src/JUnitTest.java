

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTest {
    @Test
    void checkTime(){
        TestSelenium selenium = new TestSelenium();
        double timeFast = (20/selenium.secondKm)*60;
        double timeLow = (20/selenium.firstKm)*60;
        System.out.println("Tempo di percorenza: "+(timeLow-timeFast));
        assertEquals((timeLow-timeFast) < 5,true);
    }
}

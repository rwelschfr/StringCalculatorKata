import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StringCalculatorKataTest {

    @InjectMocks
    private StringCalculatorKata stringCalculatorKata;

    @Test
    public void testAddStep1() {
        assertEquals(0, stringCalculatorKata.add(""));
        assertEquals(1, stringCalculatorKata.add("1"));
        assertEquals(3, stringCalculatorKata.add("1,2"));
    }

    @Test
    public void testAddStep2() {
        assertEquals(6, stringCalculatorKata.add("1,2,3"));
        assertEquals(10, stringCalculatorKata.add("1,2,3,4"));
    }

    @Test
    public void testAddStep3() {
        assertEquals(6, stringCalculatorKata.add("1,2\n3"));
        assertEquals(10, stringCalculatorKata.add("1,2\n3,4"));
    }

    @Test
    public void testAddStep4() {
        assertEquals(10, stringCalculatorKata.add("//loremipsum\n1loremipsum2\n3,4"));
    }

}

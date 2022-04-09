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
    public void testAddStep1() throws Exception {
        assertEquals(0, stringCalculatorKata.add(""));
        assertEquals(1, stringCalculatorKata.add("1"));
        assertEquals(3, stringCalculatorKata.add("1,2"));
        assertThrows(Exception.class, () -> stringCalculatorKata.add("1,2,3"));
    }

}

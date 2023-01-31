import org.example.Smartphone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartPhoneTest {
    @Test
    void smartphoneStartRadioTest(){
        Smartphone testPhone = new Smartphone();
        boolean result = testPhone.startRadio();
        assertTrue(result);
    }
@Test
    void smartphoneStopRadioTest(){
        Smartphone testPhone = new Smartphone();
        boolean result = testPhone.stopRadio();
        assertFalse(result);
    }



}

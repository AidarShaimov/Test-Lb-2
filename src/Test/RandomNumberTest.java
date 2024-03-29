package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomNumberTest {

	@Test
    void testGetRandomNumber() {
        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.getRandomNumber();
        
        boolean statusTest = false;
        
        if(80 <= number && number <= 120) {
            statusTest = true;
        }
        
        assertTrue(statusTest);
    }
}

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RandomArrayTest {
	@BeforeAll
	public static void randomArray_null() {
		RandomArray randomArray = new RandomArray();
        int[] array = randomArray.getRandomArray();
        
		assertTrue(array != null);
	}
	
	@Test
	void randomArray_length() {
		RandomArray randomArray = new RandomArray();
        int[] array = randomArray.getRandomArray();
		
		assertEquals(12, array.length);
	}
	
	@Test
	void randomArray_nullElem() {
		RandomArray randomArray = new RandomArray();
        int[] array = randomArray.getRandomArray();
        
        boolean statusTest = true;
        
        for(int i = 0; i < array.length; i++) {
        	if(array[i] == 0) {
        		statusTest = false;
        		break;
        	}
        }
        
        assertTrue(statusTest);
	}
}

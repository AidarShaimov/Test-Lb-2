package Test;

public class RandomArray {
	public int[] getRandomArray() {
		RandomNumber randomNumber = new RandomNumber();
		
		int[] randomArray = new int[12];
		
		for(int i = 0; i < randomArray.length; i++) {
			randomArray[i] = randomNumber.getRandomNumber();
		}
		
        return randomArray;
    }
}

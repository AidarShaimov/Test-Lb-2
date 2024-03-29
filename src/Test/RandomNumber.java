package Test;

public class RandomNumber {
	public int getRandomNumber() {
        int randomValue = 80 + (int) (Math.random() * (120 - 80 + 1));
        return randomValue;
    }
}

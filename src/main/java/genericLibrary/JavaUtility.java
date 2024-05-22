package genericLibrary;

import java.util.Random;

public class JavaUtility {
	
	public int generateRandomNumber(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}

}

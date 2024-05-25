package genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavalibraryOtp {
	
	public void keypressNumber(String number) throws IOException, InterruptedException {
		try {
			int[] keyCodes = {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}; // Key codes for digits 0 to 9

            // Loop through each character in the OTP and input it
            for (char digit : number.toCharArray()) {
            	Thread.sleep(500);
                int index = Character.getNumericValue(digit); // Get the numeric value of the digit
                if (index >= 0 && index < keyCodes.length) {
                    int keyCode = keyCodes[index];
                    String command = "adb shell input keyevent " + keyCode;
                    Runtime.getRuntime().exec(command);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	


}

import java.util.Scanner;

public class Lopez_p1 {

	public static void main(String[] args) {
		/*
		 * A company that wants to send data over the Internet
		 *  has asked you to write a program that will encrypt 
		 *  it so that it may be transmitted more securely. All 
		 *  the data is transmitted as four-digit integers. Your
		 *   application should read a four-digit integer entered 
		 *   by the user and encrypt it as follows: Replace each 
		 *   digit with the result of adding 7 to the digit and
		 *    getting the remainder after dividing the new value by 10.
		 *   Then swap the first digit with the third, and swap the 
		 *   second digit with the fourth. Then print the encrypted integer. 
		 *   Write a separate application that inputs an encrypted four-digit
		 *   integer and decrypts it (by reversing the encryption scheme) to
		 *    form the original number.
		 */
		Scanner scnr = new Scanner(System.in);
		int totalNumber;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int newTotalNumber;
		String totalNumberString;
		
		System.out.println("Please enter a four digit interger to be encrypted:");
		
		//totalNumber = scnr.nextInt();
		totalNumberString = scnr.next();
		totalNumber = Integer.parseInt(totalNumberString);
		int length= totalNumberString.length();
		
		if(length != 4) {
			System.out.println("Invalid input, unable to encrypt. please enter a four digit interger");
		}
		else {
		//obtain digits
		firstDigit = totalNumber % 10;
		totalNumber = totalNumber / 10;
		
		secondDigit = totalNumber % 10;
		totalNumber = totalNumber / 10;
		
		thirdDigit = totalNumber % 10;
		totalNumber = totalNumber / 10;
		
		fourthDigit = totalNumber % 10;
		totalNumber = totalNumber / 10;
		
		
		/*Replace each 
		 *   digit with the result of adding 7 to the digit and
		 *    getting the remainder after dividing the new value by 10.
		*/
		firstDigit = firstDigit + 7;
		firstDigit = firstDigit % 10;
		
		secondDigit = secondDigit + 7;
		secondDigit = secondDigit % 10;
		
		thirdDigit = thirdDigit + 7;
		thirdDigit = thirdDigit % 10;
		
		fourthDigit = fourthDigit + 7;
		fourthDigit = fourthDigit % 10;
		
		/*Then swap the first digit with the third, and swap the 
		 *   second digit with the fourth. Then print the encrypted integer.
		*/
		int temp1;
		int temp2;
		
		temp1 = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp1;
		
		temp2 = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp2;
		
		
		newTotalNumber = (fourthDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + firstDigit ;
		
		
		System.out.println("" + (newTotalNumber/1000) + "" + (thirdDigit) + "" + (secondDigit) + "" + firstDigit);
		
		}
		//System.out.println("fourth digit: " + fourthDigit);
		//System.out.println("third digit: " + thirdDigit);
		//System.out.println("second digit: " + secondDigit);
		//System.out.println("first digit: " + firstDigit);
	}

}

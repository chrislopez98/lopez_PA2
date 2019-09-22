import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int totalNumber;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int newTotalNumber;
		String totalNumberString;
		System.out.println("Please enter a four digit interger to be decrypted:");
		
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
		//decrypt firstDigit
		if((firstDigit > -1) && (firstDigit < 8)) {
			firstDigit = firstDigit + 3;
			firstDigit = firstDigit % 10;
		}
		else if((firstDigit == 8) || (firstDigit == 9)) {
			firstDigit = firstDigit - 7;
		}
		
		//decrypt secondDigit
		if((secondDigit > -1) && (secondDigit < 8)) {
			secondDigit = secondDigit + 3;
			secondDigit = secondDigit % 10;
		}
		else if((secondDigit == 8) || (secondDigit == 9)) {
			secondDigit = secondDigit - 7;
		}
		//decrypt thirdDigit
		if((thirdDigit > -1) && (thirdDigit < 8)) {
			thirdDigit = thirdDigit + 3;
			thirdDigit = thirdDigit % 10;
		}
		else if((thirdDigit == 8) || (thirdDigit == 9)) {
			thirdDigit = thirdDigit - 7;
		}
		//decrypt fourthDigit
		if((fourthDigit > -1) && (fourthDigit < 8)) {
			fourthDigit = fourthDigit + 3;
			fourthDigit = fourthDigit % 10;
		}
		else if((fourthDigit == 8) || (fourthDigit == 9)) {
			fourthDigit = fourthDigit - 7;
		}
		
		//rearrange digits
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
		//stored value
		newTotalNumber = (fourthDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + firstDigit ;
		//print stored value
		System.out.println("" + (newTotalNumber/1000) + "" + (thirdDigit) + "" + (secondDigit) + "" + firstDigit);
		
		}
		
		
		}

	}


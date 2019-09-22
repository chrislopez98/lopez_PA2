package lopez_p3;

import java.util.Scanner;

public class lopez_p3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		System.out.println("Would a new user like to take the poll? (1 for Yes and 0 for No");
		int again = scnr.nextInt();
		//create and initialize topics
		String[] topics = new String[5];
		topics[0] = "Football";
		topics[1] = "Basketball";
		topics[2] = "Video Games";
		topics[3] = "Rock Music";
		topics[4] = "Action Movies";
		int[][] responses = new int[5][10];
		int[] totals = new int[5];
		int rating;
		int users = 0;
		int total = 0;
		while(again == 1) {

			System.out.println("Please rate topics from 1 (least important) to 10 (most important) to you:");
			
			for (int i = 0; i < 5; i++){
				System.out.println("Please rate " + topics[i]);
				rating = scnr.nextInt();
				responses[i][(rating - 1)] = responses[i][(rating - 1)] +1;
				
			}
			users = users + 1;
			System.out.println("Would another user like to take the poll? (1 for yes and 0 for no)");
			again = scnr.nextInt();
		}
		System.out.println("Below are a summary of the results (topics are on the left column and rating value on top row:");
		
		System.out.println("		" + "1" + "	" + "2" + "	" + "3" + "	" + "4" + "	" + "5" + "	" + "6" + "	"+ "7" + "	" + "8" + "	" + "9" + "	" + "10"+ "	" + "Average");
		for (int j = 0; j < 5; j++){
			total = 0;
		System.out.print("" + topics[j] + "	" );
			for (int k = 0; k < 10; k++){
				System.out.print("" + responses[j][k]+ "	");
				total = ((responses[j][k]) * (k + 1)) + total ;
			}
			totals[j] = total;
			//average
			System.out.print("" + (double)((total + 0.0) / users));
			System.out.println("");
		}
		int maxValue = 0;
		int maxIt = 0;
		int minValue = 9999;
		int minIt = 9999;
		for (int j = 0; j < 5; j++){
			if(maxValue < totals[j]) {
				maxValue = totals[j];
				maxIt = j;
			}
			if(minValue > totals[j]) {
				minValue = totals[j];
				minIt = j;
			}
		}
		System.out.println("The lowest point total belonged to " + topics[minIt] + " with " + totals[minIt] + "points.");
		System.out.println("The highest point total belonged to " + topics[maxIt] + " with " + totals[maxIt] + "points.");
		
	}

}

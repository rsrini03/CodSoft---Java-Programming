package Task1;

import java.util.Scanner;
import java.util.Random;


public class NumberGame {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Random random = new Random();
		
		boolean flag = true;
		double total =0;
		double count=0;
		
		System.out.println("              =====WELCOME TO NUMBERGAME WORLD=====              ");
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("          Guess the number and get excellent prices😍🎁");		
		System.out.println("                   You have only 5 chances👍");
		System.out.println("-----------------------------------------------------------------");
		
		while(flag) {
				System.out.println();

				total++;
				System.out.println("Round ->> "+(int)total);
				System.out.println("Let's get start 😍😍👍");
				System.out.println();
				int n = random.nextInt(100)+1;
				boolean f = true;
				int min = 1;
				int max = 100;
				int i=1;
				
					while(i<=5){
						
						System.out.print("Enter your guess😁 : ");
						int input = x.nextInt();
						if(input==n) {
							System.out.println("Your answer is absolutely correct!!");

							f=false;
							count++;
							System.out.println();

							break;
						}
						else if(input>n) {
							if(i!=5) {
							System.out.print("Your answer is too high!!");
							max = input;
							System.out.println("Guess between "+min+" and "+max);
							}else {
								System.out.println("Game Over");
								System.out.println();
							}
						}
						else {
							if(i!=5) {
							System.out.print("Your answer is too low!!");
							min = input;
							System.out.println("Guess between "+min+" and "+max);
							}else {
								System.out.println("Game Over");
								System.out.println();
							}
						}
						
						i++;
					}
				
				System.out.println("You want to play again? type yes / no");
				System.out.println();
				System.out.print("Enter your wish😍 : ");
				String s = x.next();
				System.out.println("-----------------------------------------------------------------");
				System.out.println();				
				if(s.toLowerCase().equals("no")) {
					break;
				}
		}
		
		double per = (count/total)*100;
		
		System.out.println("You have scored "+(int)per+"%");
		x.close();
	}
}

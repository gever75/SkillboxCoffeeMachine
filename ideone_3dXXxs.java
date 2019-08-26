/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Кофе-машина");
		
		int moneyAmount = 55;
		
		int cappucinoPrice = 200;
		int espressoPrice = 99;
		int milkPrice = 40;
		int waterPrice = 15;
		
		
		boolean canBuyAnything = false;
		
		if(moneyAmount >= cappucinoPrice) {
			System.out.println("Вы можете купить капучино");
			canBuyAnything = true;
		}
		
		if(moneyAmount >= espressoPrice) {
			System.out.println("Вы можете купить эспрессо");
			canBuyAnything = true;
		}
		
		if(moneyAmount >= milkPrice) {
			System.out.println("Вы можете купить молоко");
			canBuyAnything = true;
		}
		
		if(moneyAmount >= waterPrice) {
			System.out.println("Вы можете купить воду");
			canBuyAnything = true;
		}
			
		
		if(canBuyAnything == false) {
			System.out.println("Недостаточно средств :( Учите джаву и идите работать!");
		}
	}
}
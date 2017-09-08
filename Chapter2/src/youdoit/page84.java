package youdoit;

import java.util.Scanner;

public class page84 {

	public static void main(String[] args) 
	{
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		name = input.nextLine();
		
		System.out.print("Please enter an integer >> ");
		anInt = input.nextInt();
		System.out.print("Please enter a byte integer >> ");
		aByte = input.nextByte();
		System.out.print("Please ener a short integer >> ");
		aShort = input.nextShort();
		System.out.print("Please enter a long integer >> ");
		aLong = input.nextLong();
		
		System.out.println("Your name is : " + name);
		System.out.println("Your int is : " + anInt);
		System.out.println("Your byte is : " + aByte);
		System.out.println("Your short is : " + aShort);
		System.out.println("Your long is : " + aLong);

	}

}

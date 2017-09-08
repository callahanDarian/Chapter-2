package gameZone;

import java.util.Scanner;

public class madlibs {

	public static void main(String[] args) 
	{
		String colour;
		String wordEst;
		String bodyPartPlural;
		String anAnimal, aNoun, pluralNoun;
		
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a colour >> ");
		colour = input.nextLine();
		System.out.print("Enter a word that ends in 'est' >> ");
		wordEst = input.nextLine();
		System.out.print("Enter a plural body part >> ");
		bodyPartPlural = input.nextLine();
		System.out.print("Enter an animal >> ");
		anAnimal = input.nextLine();
		System.out.print("Enter a noun >> ");
		aNoun = input.nextLine();
		System.out.print("Enter a plural noun >> ");
		pluralNoun = input.nextLine();
		System.out.print("Enter a number >> ");
		a = input.nextInt();
		System.out.print("Enter another number >> ");
		b = input.nextInt();
		
		c = a - b;
		
	}

}

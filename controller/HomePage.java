package controller;

import java.util.Scanner;

import service.MainService;

public class HomePage 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("WELCOME TO ECART SERVICES\n");
		
		System.out.println("1 - Start Shopping\n2 - View Cart\n3 - Check out\n");
		
		int option = scan.nextInt();
		
		switch(option)
		{
		case 1: 
			MainService service = new MainService();
			service.display();
				break;
		}
		scan.close();
	}

}

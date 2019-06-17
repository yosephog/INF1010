/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oppgave51;

import java.util.Scanner;

/**
 *
 * @author gena1010
 */
public class Mobile {
    String marke;
	String eier;
	int Number;
	
	void settVerdy(String mark, String eier, int number)
	{
		this.marke = mark;
		this.eier= eier;
		this.Number=number;
	}
	
	void entry()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Type your mobile model ");
		String read1 = in.nextLine();
		System.out.println("Type your name  ");
		String read2 = in.nextLine();
		System.out.println("Type mobile number  ");
		int read3 = Integer.parseInt( in.nextLine());
		this.settVerdy(read1,read2,read3);
	}

	void display()
	{
		System.out.println("Mobile Marker = " + this.marke);
		System.out.println("Mobile owner is = " +  this.eier);
		System.out.println("Mobile number = " + this.Number);

	}

    
}

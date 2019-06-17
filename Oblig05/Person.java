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
public class Person {
    String navn;
	int alder;
	String bosted;
	
	void settVerdy(String navn, String bosted, int alder)
	{
		this.navn = navn;
		this.bosted= bosted;
		this.alder=alder;
	}
	
	void entry()
	{
		Scanner in = new Scanner(System.in);
		System.out.println(" enter name");
		String read1 = in.nextLine();
		System.out.println("enter bosted  ");
		String read2 = in.nextLine();
		System.out.println("enter alder ");
		int read3 = Integer.parseInt( in.nextLine());
		this.settVerdy(read1,read2,read3);
	}

	void display()
	{
		System.out.println("navnet er = " + this.navn);
		System.out.println("bosted er= " +  this.bosted);
		System.out.println("alder er = " + this.alder);

	}

    
    
}

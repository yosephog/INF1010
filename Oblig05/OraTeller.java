/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egenoppgave;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class OraTeller {
  
String name;
	int age;
	int weight;
	
	
	
	void entry()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Type your Name  ");
		this.name = in.nextLine();
		System.out.println("Type your age  ");
		this.age = Integer.parseInt(in.nextLine());
		System.out.println("Register the weight  ");
		this.weight = Integer.parseInt( in.nextLine());
		
	}

	void display()
	{
		System.out.println("Mobile Marker = " + this.name);
		System.out.println("Mobile owner is = " + this.age);
		System.out.println("Mobile number = " + this.weight);

	}
	

}

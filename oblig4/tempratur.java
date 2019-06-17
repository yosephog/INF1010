import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Temperatur {

	static void gjennomsnitt(float sum){
		int antall = 12;

	float gjennomsnittsTemperaturen = sum/antall;
	System.out.println("gjennomsnittsTemperaturen i år: "+gjennomsnittsTemperaturen);

}
	public static void main (String[] args) throws Exception {
 		String ord;
 		int i = 0;
 		int sum = 0;
 		int[] minArray = new int [12];

	String filNavn = "temperatur.txt";
	Scanner temperaturFil = new Scanner(new File(filNavn));

	while (temperaturFil.hasNextLine()) {
	    ord = temperaturFil.nextLine();

	    minArray[i] = Integer.parseInt(ord);
	    i++;
	}
	    
	    for(int j=0; j<12; j++) {
	    	sum = sum + minArray[j];
	    }
System.out.println(sum);

gjennomsnitt(sum);





	    }

	}



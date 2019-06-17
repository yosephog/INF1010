
package yosephogoppgave04;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class YosephogOppgave04 {
    
      public static void main(String[] args) throws Exception{
       Oppgave07 opp=new Oppgave07();
       opp.display();
        
    }
}
      class Oppgave07 {
   
    Tabell<Pasienter> pasientTabell=new Tabell<>(100);
    Pasienter pasientee=null;
    int pasienterCounter=0;
    
    Tabell<LegeMidler> legeMidlerTabell=new Tabell<>(100);
    LegeMidler legeMidlee=null;
    int legeMidlerCounter=0;
    
    SortertEnkelListe<Leger> legerTabell=new SortertEnkelListe<>();
    int legerCounter=0;
    int fastLegerCounter=0;
    Leger legee=null;
    
   // SortertEnkelListe<FastLeger> fastLegeTabell=new SortertEnkelListe<>();
    
    EnkelReseptListe enkelResepter=new EnkelReseptListe();
    Resepter reseptere=null;
    int reseptCounter=0;
    EldsteForstReseptListe legerResepter=new EldsteForstReseptListe();
    YngsteForstReseptListe pasientResepter = new YngsteForstReseptListe();
    
    
    int pasientCounter=0;
    
    
  public void display() throws Exception {
		Scanner in = new Scanner(System.in);
		menu();
		System.out.println("enter your choice");
		
		while (in.hasNext()) {
			
			String choice = in.nextLine();
			
			if (choice.equalsIgnoreCase("R")) {
				readFile("C:\\Users\\yoseph\\Documents\\NetBeansProjects\\YosephogOppgave04\\src\\yosephogoppgave04\\list.txt");
			}

			if (choice.equalsIgnoreCase("RI")) {
				writeFile("C:\\Users\\yoseph\\Documents\\NetBeansProjects\\YosephogOppgave04\\src\\yosephogoppgave04\\newList.txt");
			}
			if (choice.equalsIgnoreCase("D")) {
				displayFile("C:\\Users\\yoseph\\Documents\\NetBeansProjects\\YosephogOppgave04\\src\\yosephogoppgave04\\list.txt");
			}
			if (choice.equalsIgnoreCase("LM")) {
				setNyLegeMiddler();
			}
			if (choice.equalsIgnoreCase("Le")) {
				setNyLege();
			}
			if (choice.equalsIgnoreCase("P")) {
				setNyPerson();
			}
			if (choice.equalsIgnoreCase("DP")) {
				view();

			}
			if (choice.equalsIgnoreCase("X")) {
				System.exit(0);
			}
                        if(choice.equalsIgnoreCase("H")){
                            hentLegeMidler();
                        }
			if (choice.equalsIgnoreCase("RE")) {
				setNyResept();
			}
			if (choice.equalsIgnoreCase("ST")) {
                            statisticDisplay();
				}

			
			menu();
			System.out.println("enter choice");
		}
	}
  
        public void displayFile(String fil)throws Exception{
            Scanner in=new Scanner(new File(fil));
            while(in.hasNextLine()){
                String txt=in.nextLine();
                System.out.println(txt);
            }
            in.close();
        }
        public  void readFile(String fil) throws Exception{
        
            try{
        
         Scanner in= new Scanner(new File(fil));
         
         String txt="";
         while(in.hasNextLine()){
            
             txt=in.nextLine();
             
            
             
            
            
             
             if(txt.contains("# Legemidler")){
                 System.out.println(txt);
                 int nr=0;String navn ="" , form="" , type ="";
            double pris=0.0; int antall=0; double virkstoff=0.0, mengde=0.0; int styrke=0;
                 while(txt.length()>0){
                     txt=in.nextLine().trim();
                     if(txt.length()>0){
                         if(txt.length()==8){
                             String[] lm=txt.split("");
                             nr=Integer.parseInt(lm[0]);
                             navn=lm[1];
                             form=lm[2];
                             type=lm[3];
                             pris=Double.parseDouble(lm[4]);
                             antall=Integer.parseInt(lm[5]);
                             virkstoff=Double.parseDouble(lm[6]);
                             styrke=Integer.parseInt(lm[7]);
                             
                             if(form.equalsIgnoreCase("mikstur")){
                                 if(type.equalsIgnoreCase("a")){
                                     legeMidlee=new TypeAMikstur(nr,navn,form,type,pris,antall,
                                     virkstoff,styrke);
                                     legeMidlerTabell.setElement(legeMidlee, legeMidlerCounter);
                                     
                                 }
                             }
                             if(form.equalsIgnoreCase("pille")){
                                 if(type.equalsIgnoreCase("a")){
                                     legeMidlee=new TypeAPiller(nr,navn,form,type,pris,antall,
                                     virkstoff,styrke);
                                     legeMidlerTabell.setElement(legeMidlee, legeMidlerCounter);
                                     
                                 }
                             }
                             if(form.equalsIgnoreCase("mikstur")){
                                 if(type.equalsIgnoreCase("b")){
                                     legeMidlee=new TypeBMikstur(nr,navn,form,type,pris,antall,
                                     virkstoff,styrke);
                                     legeMidlerTabell.setElement(legeMidlee, legeMidlerCounter);
                                     
                                 }
                             }
                             if(form.equalsIgnoreCase("pille")){
                                 if(type.equalsIgnoreCase("b")){
                                     legeMidlee=new TypeBPiller(nr,navn,form,type,pris,antall,
                                     virkstoff,styrke);
                                     legeMidlerTabell.setElement(legeMidlee, legeMidlerCounter);
                                     
                                 }
                             }
                         }
                         if(txt.length()==7){
                             if(form.equalsIgnoreCase("mikstur")){
                                 if(type.equalsIgnoreCase("c")){
                                     legeMidlee=new TypeCMikstur(nr,navn,form,type,pris,antall,
                                     virkstoff);
                                     legeMidlerTabell.setElement(legeMidlee, legeMidlerCounter);
                                     
                                 }
                                  if(form.equalsIgnoreCase("pille")){
                                 if(type.equalsIgnoreCase("c")){
                                     legeMidlee=new TypeCPiller(nr,navn,form,type,pris,antall,
                                     virkstoff);
                                     legeMidlerTabell.setElement(legeMidlee, legeMidlerCounter);
                                     
                                 }
                             }
                             
                         }
                     }
                         legeMidlerCounter++;
                         System.out.println(txt);
                 }
             }
             }
             if(txt.contains("# Person")){
                 System.out.println(txt);
                 while(txt.length()>0){
                 txt=in.nextLine().trim();
                 if(txt.length()>0){
                 String[] pasiente=txt.split("");
                 int nr=Integer.parseInt(pasiente[0]);
                 String navn=pasiente[1];
                 String fnr= pasiente[2];
                 String add= pasiente[3];
                 String post= pasiente[4]; // change post to int dont forger
                 
                  pasientee=new Pasienter(nr,navn,fnr,add,post);
                 pasientTabell.setElement(pasientee, pasientCounter);
                 pasientCounter++;
                 System.out.println(txt);
                 }
             }
                 
         } 
             if(txt.contains("# Leger")){
                 
             System.out.println(txt);
             while(txt.length()>0){
                 txt=in.nextLine().trim();
                 if(txt.length()>0){
                     String[] lege=txt.split("");
                    String  navn=lege[0];
                     String avtale=lege[1];
                    
                     
                         legee=new Leger(navn,avtale);
                     legerTabell.settInn(legee);
                     legerCounter++;
                    
                     
                     System.out.println(txt);
                     
                     
                     }
                    
                    
                    
                     
                 }
            // System.out.println(txt);
             }
             if(txt.contains("# Resepter")){
                 System.out.println(txt);
                 while(txt.length()>0){
                     txt=in.nextLine().trim();
                     if(txt.length()>0){
                         String[] resept= txt.split("");
                         int nr=Integer.parseInt(resept[0]);
                         
                         String color=resept[1];
                         int perNum=Integer.parseInt(resept[2]);
                         String legeNavnn=resept[3];
                         int legeMidNavn= Integer.parseInt(resept[4]);
                         int reit=Integer.parseInt(resept[5]);
                         
                         if(color.equalsIgnoreCase("blaa")){
                             
                             reseptere=new ResepterBlo(nr,color,pasientTabell.finnElement(perNum),
                                     legerTabell.finn(legeNavnn),legeMidlerTabell.finnElement(legeMidNavn),reit);
                             enkelResepter.settInnResepter(reseptere);
                         }
                         if(color.equalsIgnoreCase("hvit")){
                              reseptere=new ResepterHvite(nr,color,pasientTabell.finnElement(perNum),
                                     legerTabell.finn(legeNavnn),legeMidlerTabell.finnElement(legeMidNavn),reit);
                             enkelResepter.settInnResepter(reseptere);
                         }
                         for(Pasienter p : pasientTabell){
                             if(p.getUnikNummer()==perNum){
                                 pasientResepter.settInnYngste(reseptere);
                             }
                             for(Leger l : legerTabell){
                                 if(l.getNavn().equalsIgnoreCase(legeNavnn)){
                                     legerResepter.settInnEldeste(reseptere);
                                 }
                             }
                             reseptCounter++;
                         }
                         System.out.println(txt);
                     }
                 }
                
             }
         }
         // ;
        in.close();
      }
            catch(Exception ex){
                
            }
        }
        
     public void hentLegeMidler(){
       
         Scanner in=new Scanner(System.in);
         System.out.println("enter perNumer eller unikNummer");
         String perNum=in.nextLine();
        // int perNumm=Integer.parseInt(perNum);
         
         for(Resepter res : enkelResepter){
             if(res.pasientNavn.getFodselsNummer().equalsIgnoreCase(perNum)){
                 if(res.getreit()>0){
                     for(Pasienter pp : pasientTabell){
                         System.out.println(res.toString() + " " + res.pasientNavn.getNavn());
                     }
                 }
             }
         }
        
     }
     public void hentVanndannede(){
         int counter=0;
         int osloCounter=0;
         
         for(Resepter rr : enkelResepter){
             if(rr.getLegeMidler() instanceof TypeBMikstur ){
             counter++;
         }
             for(Pasienter pp : pasientTabell){
                 int postNr=Integer.parseInt(pp.getPostNummer());
                 if(postNr < 1300){
                     osloCounter++;
                 }
             }
         }
          System.out.println("vanndannende" + counter);
          System.err.append("number of people in oslo" + osloCounter);
     }
    
     public void blaaResepter(){
         
         int pasNr=2;
         for(Resepter er : enkelResepter){
             if(er instanceof ResepterBlo && ((ResepterBlo)er).getUnikNummer()==pasNr)
                 System.out.println(er.toString());
         }
     }
     
     public void legeResepterMikstur(){
         System.out.println("Lege resepter");
         String docName="Dr. phill";
         int pillCounter=0;
         int miksCounter=0;
         
         for(Resepter lr : legerResepter){
             String docName2=lr.getLeger().getNavn();
             if(docName.equalsIgnoreCase(docName2)){
                 int legeMidNum=lr.getUnikNummer();
                 LegeMidler lmd = legeMidlerTabell.finnElement(legeMidNum);
                 if (lmd instanceof Mikstur) { 
                     miksCounter++;
                     
												
					
				}
                 if(lmd instanceof Piller){
                     pillCounter++;
                 }
		System.out.println(lr);		
             }
             System.out.println(pillCounter);
             System.out.println(miksCounter);
             }
         
     }
     
     public void legeReseptNarkotisk(){
        System.out.println("lege resepter narkotisk"); 
        for(Leger le : legerTabell){
          String legeName1 = le.getNavn();
			int count = 0;
			for (Resepter re : enkelResepter) {
				if (re.getreit() >= 0) {
					String legeName2 = re.getLeger().getNavn();

					if (legeName1.equalsIgnoreCase(legeName2)) {
						int lmdNum = re.getUnikNummer();
						LegeMidler lmd = legeMidlerTabell.finnElement(lmdNum);

						if (lmd instanceof TypeAPiller || lmd instanceof TypeAMikstur) {
                                                    
							count++;

							// System.out.println(le.getNavn()+", "+count);

						}

					}
				}
			}
			System.out.println(le.getNavn() + ", " + count); 
        }
        
     }
     public void personReseptpaaNarkotisk() {

		System.out.println(" person navn , count narkotisk resepter per person ");
				

		for (Pasienter pe : pasientTabell) {

			int perId1 = pe.getUnikNummer();
			int count = 0;
			for (Resepter re : enkelResepter) {
				if (re.getreit() > 0) {
					int perId2 = re.getUnikNummer();

					if (perId1 == perId2) {
						int lmdNum = re.getUnikNummer();
						LegeMidler lmd = legeMidlerTabell.finnElement(lmdNum);

						if (lmd instanceof TypeAPiller || lmd instanceof TypeAMikstur) {
							count++;

							// System.out.println(le.getNavn()+", "+count);

						}

					}
				}
			}
			System.out.println(pe.getNavn() + ", " + count);
		}

	}
     public void view() {
		Scanner in = new Scanner(System.in);
		System.out
				.println(" if you want to view person/lege/legemidler/resept");
		System.out.println(" press : p/l/lm/r");
		String choice = in.nextLine();
		if (choice.equalsIgnoreCase("P")) {
			System.out.println("Nr, name, fnr, adresse, postnr");
			for (Pasienter pe : pasientTabell) {
				System.out.println(pe);
			}
		}

		if (choice.equalsIgnoreCase("L")) {
			System.out.println("Name, avtalenr");
			for (Leger le : legerTabell) {
				System.out.println(le + ", " + le.getAvtaleNummer());
			}
		}
		if (choice.equalsIgnoreCase("r")) {
			System.out.println("Nr, colour, fnr, legenavn, legmidlenr, reit");
			for (Resepter re : enkelResepter) {
				// System.out.println(re.getUniqNummer() + ", " + re.getColour()
				// + ", " + re.getId() + ", " + re.getLeger().getNavn()
				// + "," + re.getLegemiddler().getUniqNummer() + ", "
				// + re.getReit());
				System.out.println(re);
			}
			if (choice.equalsIgnoreCase("lm")) {
				System.out
						.println("Nr, name, form, type, pris, antall/mengde, virkestoff");
				for (LegeMidler le : legeMidlerTabell) {
					System.out.println(le);
				}
			}
		}

	}
     
     public void statisticDisplay(){
	Scanner in = new Scanner(System.in);
					
	System.out.println("vannedannenderesepter/blaapersonresept/legensReseptpaamikstur/"
			+ "legerreseptpaanarkotisk/hentelegemidler/personreseptpaanarkotisk");
	System.out.println("press v/b/lm/ln/h/pn/X for exit");
					
			
			while(in.hasNextLine()){
				String choice=in.nextLine();
			if (choice.equalsIgnoreCase("v")) {
			
				hentVanndannede();
				
			}
			
			if (choice.equalsIgnoreCase("h")) {
			
				hentLegeMidler();
				
			}
			if (choice.equalsIgnoreCase("ln")) {
			
				legeReseptNarkotisk();
				
			}
			if (choice.equalsIgnoreCase("b")) {
			    
				blaaResepter();
			
			}
			if (choice.equalsIgnoreCase("lm")) {
			
				legeResepterMikstur();
				
			}
			
			if (choice.equalsIgnoreCase("pn")) {
			
				personReseptpaaNarkotisk();
				
			}
			if(choice.equalsIgnoreCase("X")){
				System.exit(0);
			}
					
			System.out
			.println("vannedannenderesepter/blaapersonresept/legensReseptpaamikstur/"
					+ "legerreseptpaanarkotisk/hentelegemidler/personreseptpaanarkotisk");
			System.out.println("press v/b/lm/ln/h/pn/x for exit");
				}
}
     public static void menu() {
		System.out.println("======== Menu ========");
		System.out.println("To read a file press R");
		System.out.println("To write a file press RI");
		System.out.println("To display a file press D");
		System.out.println("To creat and add legeMidler press LM");
		System.out.println("To creat and add a lege press LE");
		System.out.println("To creat and add a person press P");
		System.out.println("To creat and add a resept press RE ");
		System.out.println("To find a legeMidler on a resept press H");
		System.out.println("To display preference prepss DP");
		System.out.println("To display different statistics ST");
		System.out.println(" if you want to exit press X");

	}
     public void writeFile(String fil) throws Exception {

		Scanner in = new Scanner(new File(fil));
		String txt;
		PrintWriter writer = new PrintWriter("list.txt");
		while (in.hasNextLine()) {
			txt = in.nextLine();

			writer.println(txt);
		}
		in.close();
		writer.close();

	}
     public  void setNyLegeMiddler(){
        Scanner in=new Scanner(System.in);
        int counter=0;
        System.out.println("enter nr");
        int nr = in.nextInt();
        System.out.println("enter legeMidler navn");
        String name=in.nextLine();
         String jump=in.nextLine();
        System.out.println("enter legeMidler price");
       
        double pris=in.nextDouble();
        System.out.println("enter virkstoff/strength");
        int virkestoff=in.nextInt();
                    String jum=in.nextLine();

        System.out.println("enter form");
        String form=in.nextLine();
        
        if (form.equalsIgnoreCase("mikstur")) {
			System.out.println("enter type A/B/C");
			String type = in.nextLine();
        	if (type.equalsIgnoreCase("a")) {
        		System.out.println("enter mengde");
        		int mengde = in.nextInt();
        		System.out.println("enter styrke");
        		String styrke = in.nextLine();
				legeMidlee = new TypeAMikstur(nr, name,form,type,pris,
						virkestoff, Integer.parseInt(styrke),
						mengde);
				legeMidlerTabell.setElement(legeMidlee,
						legeMidlerCounter);
				// legeMidlerCounter++;
				// System.out.println(legeMidlerTabell.);
			} else if (type.equalsIgnoreCase("b")) {
				System.out.println("enter mengde");
        		int mengde = in.nextInt();
        		System.out.println("enter styrke");
        		String styrke = in.nextLine();
				legeMidlee = new TypeBMikstur(nr, name,form,type, pris,
						virkestoff, Integer.parseInt(styrke),
						mengde);
				legeMidlerTabell.setElement(legeMidlee,
						legeMidlerCounter);
			} else if (type.equalsIgnoreCase("c")) {
				System.out.println("enter mengde");
        		int mengde = in.nextInt();
				legeMidlee = new TypeCMikstur(nr, name,form,type, pris,
						virkestoff, mengde);
				legeMidlerTabell.setElement(legeMidlee,
						legeMidlerCounter);

			}
		}

		else if (form.equalsIgnoreCase("pille")) {
			System.out.println("enter type A/B/C");
			String type = in.nextLine();
			if (type.equalsIgnoreCase("a")) {
				System.out.println("enter antall piller");
        		int antPiller = in.nextInt();
        		System.out.println("enter styrke");
        		String styrke = in.nextLine();
				
				legeMidlee = new TypeAPiller(nr, name,form,type, pris,
						virkestoff, Integer.parseInt(styrke),
						antPiller); // styrke
				
				legeMidlerTabell.setElement(legeMidlee,
						legeMidlerCounter);
			} else if (type.equalsIgnoreCase("b")) {
				System.out.println("enter antall piller");
        		int antPiller = in.nextInt();
        		System.out.println("enter styrke");
        		String styrke = in.nextLine();

				legeMidlee = new TypeBPiller(nr, name,form,type, pris,
						virkestoff, Integer.parseInt(styrke),
						antPiller); // styrke
				// is
				// now
				// vanedannende
				legeMidlerTabell.setElement(legeMidlee,
						legeMidlerCounter);
			} else if (type.equalsIgnoreCase("c")) {
				System.out.println("enter antall piller");
        		int antPiller = in.nextInt();
				legeMidlee = new TypeCPiller(nr, name,form,type, pris,
						virkestoff, antPiller);
				legeMidlerTabell.setElement(legeMidlee,
						legeMidlerCounter);
			}
		}
		legeMidlerCounter++;
	}

     public void setNyLege() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter doctors name");
		String name = in.nextLine();

		System.out.println("enter avtale nummer");
		String avtale = in.nextLine();
		legee = new Leger(name, avtale);
		legerTabell.settInn(legee);
		legerCounter++;

	}

	public void setNyPerson() {

		Scanner inpe = new Scanner(System.in);

		System.out.println(" Enter unique number ");
		int unique = inpe.nextInt();
		String j = inpe.nextLine();
		System.out.println("Enter name ");
		String name = inpe.nextLine();

		System.out.println(" enter personal number");
		String fnr = inpe.nextLine();
		String je = inpe.nextLine();
		System.out.println(" enter address name and vei nummer ");
		String address = inpe.nextLine();

		System.out.println(" enter post number");
		String postNummer = inpe.nextLine();

		pasientee = new Pasienter(unique, name, fnr, address, postNummer);
		pasientTabell.setElement(pasientee, pasientCounter);

		pasientCounter++;
		for (Pasienter p : pasientTabell) {
			System.out.println(p.getNavn() + " " + pasientCounter);
		}
	}

	public void setNyResept() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter resept uniq number");
		int uniqN = in.nextInt();
		if (in.hasNextLine()) {
			in.nextLine();
		}

		System.out.println("Enter resept colour");
		String colour = in.nextLine();
		if (colour.equalsIgnoreCase("blue")) {
			System.out.println(" enter resept pris");
			int reseptPris = in.nextInt();
                        
			// ResepterPris p=new ResepterPris(reseptPris);

		

		System.out.println(" enter personal number or id");
		int id = in.nextInt();
		String jump = in.nextLine();
		System.out.println("enter the doctor name");
		String name = in.nextLine();

		System.out.println("enter legeMidler number");
		int midlerNu = in.nextInt();
		String jum = in.nextLine();
		System.out.println(" enter reit");
		int reit = in.nextInt();
		reseptere = new ResepterBlo(uniqN, colour, pasientTabell.finnElement(id), legerTabell.finn(name),
				legeMidlerTabell.finnElement(midlerNu), reit);

		// reseptTabell.setObject(r, reseptCounter);
		enkelResepter.settInnResepter(reseptere); 
                }
                if (colour.equalsIgnoreCase("hvite")) {
			System.out.println(" enter resept pris");
			int reseptPris = 0;
                        
			// ResepterPris p=new ResepterPris(reseptPris);

		

		System.out.println(" enter personal number or id");
		int id = in.nextInt();
		String jump = in.nextLine();
		System.out.println("enter the doctor name");
		String name = in.nextLine();

		System.out.println("enter legeMidler number");
		int midlerNu = in.nextInt();
		String jum = in.nextLine();
		System.out.println(" enter reit");
		int reit = in.nextInt();
		reseptere = new ResepterHvite(uniqN, colour, pasientTabell.finnElement(id), legerTabell.finn(name),
				legeMidlerTabell.finnElement(midlerNu), reit);

		// reseptTabell.setObject(r, reseptCounter);
		enkelResepter.settInnResepter(reseptere); 
                }
                

		reseptCounter++;

	}

      }
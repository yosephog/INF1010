// jeg har fått hjelp fra andre siden den var vanskelig.
package tictacktok;



import java.util.*;
public class TicTackTok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] row0= {0,0,0};
		int[] row1= {0,0,0};
		int[] row2= {0,0,0};
		int player=0;
		int pass = 0;

		Scanner in = new Scanner(System.in);

		
		

		for(int i =0; i<9; i++)
		{
			
			if (i%2==0)
				{
					
				player=1;

				}
			else 
				{
				 player = 2;
				}

 				
			do {

				System.out.println("spiler "+ player + ":  mark your location");
				System.out.println("mark your row ");
				int row = Integer.parseInt( in.nextLine());
				System.out.println("mark your colum ");
				int colum = Integer.parseInt( in.nextLine());

				// to decide pass  i will use it later  && (0<=colum<=2)
					if ( row==0 )
					{
						if(row0[colum]==0)
						{
							row0[colum]=player;	
							pass =1;
						}
						else
						{
							pass=0;
							System.out.println("It is taken try again");
						}
					}
					else if ( row==1)
					{
						if(row1[colum]==0)
						{
							row1[colum]=player;	
							pass =1;
						}
						else
						{
							pass=0;
							System.out.println("It is taken try again");
						}
					}
					else if ( row==2)
					{
						if(row2[colum]==0)
						{
							row2[colum]=player;	
							pass =1;
						}
						else
						{
							pass=0;
							System.out.println("It is taken try again");
						}
					}



				}while(pass == 0);




			



		}

	System.out.println("Game over ?");
	System.out.println(Arrays.toString(row0));
	System.out.println(Arrays.toString(row1));
	System.out.println(Arrays.toString(row2));



        // TODO code application logic here
    }
    
}

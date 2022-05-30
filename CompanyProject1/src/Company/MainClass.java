package Company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("wellcome to Lidl Market");
		System.out.println("================================");
		System.out.println("******************************************************************************");
		System.out.println("PLEASE NOTE THAT WE HAVE IMPORTED GOODS AND LOCAL GOODS WITH DIFFERENT COST !");
		System.out.println("******************************************************************************");
	        System.out.println("1-the price of the chocolate bar: 0.85 $ plus Free Tax");
        	System.out.println("2-the price of the packet of headache pills: 9.75 $ plus Free Tax");
			System.out.println("3-the price of the Books: 12.49 $ plus Free Tax");
			System.out.println("4-the price of the CD: 14.99 $ plus 0.10 Tax");
			System.out.println("5-the price of the bottle of Perfums: 18.99 $ plus 0.10 Tax");
		    System.out.println("6-the price of the box of imported chocolates: 11.25 $ plus 0.05 Tax");
		    System.out.println("10-the price of the imported bottle of perfume : 27.99 $ plus 0.15 Tax");
		double sumTotal=0.0; 
		double sumTax=0.0;
		int coAray=0;
		String [] receipt=new String [100];
		boolean continu=true; 	
		while(continu) {
		int x=0;
		int y=0;

			while(x!=1 && x!=2 && x!=3 && x!=4){ //customer should select one either local or imported 
			
			try{
				System.out.println("=============================================================================================================");
				System.out.println("PLEASE MAKE YOUR CHOICE BY PRESSING ONE OF THE NUMBERS 1:LOCAL GOODS OR 2:IMPORTED GOODS OR 3:BUY OR 4:Exit ");		
				System.out.println("=============================================================================================================");

				Scanner n=new Scanner(System.in);
			      x=n.nextInt();
		    
			}
			catch(InputMismatchException ex){}
		
	  
		   } //end loop for selecting local and imported goods
			
			
				
			
			switch(x) {
			
				case 1:{ // case 1 for local goods
					System.out.println("Local Goods contains the following Itmes , press one of the numbers : ");
				
					while(y!=1 && y!=2 && y!=3 && y!=4 && y!=5)
					{
					
					try{
						System.out.println("==============================================================================");
						System.out.println(" 1:Food(chooklate) , 2:packet of headache pills , 3:Books , 4:CD , 5:bottle of Perfums ");
						System.out.println("==============================================================================");
						Scanner n=new Scanner(System.in);
					      y=n.nextInt();
				    
					}
					catch(InputMismatchException ex){}
				
				   }
					
					if (y==1){
						       sumTotal+=1.99; 
						       receipt[coAray]="chocklet bar: 0.85 $";

						       coAray+=1;
						       
					}
					if (y==2) {
					        	sumTotal+=9.75; 
							    receipt[coAray]="packet of headache pills: 9.75 $";

					        	coAray+=1;
					}
					if (y==3) {
								sumTotal+=12.49;
							    receipt[coAray]="Books: 12.49 $";

								coAray+=1;
					}
					if (y==4) {
								sumTotal+=14.99;
								sumTax+=0.10;
							    receipt[coAray]="CD: 14.99 $";

								coAray+=1;
					}
					if (y==5) {
								sumTotal+=18.99;
								sumTax+=0.10;
							    receipt[coAray]="bottle of Perfums: 18.99 $";

								coAray+=1;
					}
					
				}
				        break;
				         
				
				case 2: // case 2 for imported goods 
					System.out.println("imported Goods contains the following Itmes , press one of the numbers :  ");
					
					while(y!=1 && y!=2)
					{
					
					try{
						System.out.println("================================================================================================================");
						System.out.println("Please enter number 1:Food(box of imported chocolates) , 2:imported bottle of perfume");
						System.out.println("================================================================================================================");
						Scanner n=new Scanner(System.in);
					      y=n.nextInt();
				    
					}
					catch(InputMismatchException ex){}
				
				   }
					
					if (y==1){
					        sumTotal+=1.99;
							sumTax+=0.05;
						    receipt[coAray]="box of imported chocolates: 11.25 $";

							coAray+=1;
			             	}
				 
		        	if (y==2) {
							sumTotal+=27.99;
							sumTax+=0.15;
						    receipt[coAray]="imported bottle of perfume : 27.99 $";

							coAray+=1;
				}
		    	
			     break;
			
				case 3: // case 3 for buying selected items 
					if(receipt[0]==null)break;
					System.out.println("will you pay with credit card or with cash money ? ");
					                boolean cash=true; boolean creditCard =true; boolean rightpass=false;
					                while(cash && creditCard) {
					            	   try {
					            	    System.out.println("please enter (card) for credit card paying or (cash) for bar money paying ;");
										Scanner car=new Scanner(System.in);
										        String pay=car.next();
										        if(pay.equalsIgnoreCase("card")) {creditCard=false;}else if(pay.equalsIgnoreCase("cash")) {cash=false;}
					            	   }
					            	   catch(InputMismatchException ex) {}
					            	   
					               }
					                    while(!creditCard && !rightpass) {
					                    	try {
					                    	System.out.println("please enter your right credit cards password ? ");
											Scanner password=new Scanner(System.in);
													String pass=password.next();
					                    	        if (pass.equalsIgnoreCase("1234"))
					                    	        {
					                    	        	System.out.println(" *paied is successful*");
					                    	        	rightpass=true;
					                    	        	}
					                    	        else 
					                    	        {
					                    	        	System.out.println("*Error password*");
					                    	        	rightpass=false;
					                    	        }
					                        	}
					                    	catch(InputMismatchException ex) {}
					                    	       
					                    }
					continu=false;
					break;
				
				case 4:	// case 4 for exit and return items 					
					String answer="";
					System.out.println("ARE YOU SURE YOU WANT TO EXIT ?");
					while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
					{
						try {
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println(" PLEASE CONFIRME YOUR ANSWER BY PRESSING ONE OF THE LETTER 'Y'=YES for Exit OR 'N'=NO for Continue ");
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						Scanner an=new Scanner(System.in);
                       answer=an.next();
						}
						catch(InputMismatchException ex) {}
					}
					 if (answer.equalsIgnoreCase("y")) {
				     continu=false;
					 for(int i=0;i<coAray;i+=1)
					 receipt[i]=null;
					 }
					 else continu=true;
				break;
					
			
     	} // switch end
			
			
	} //while for  continue buying loops 
			if (receipt[0]==null) { 
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println(" // thanks for your visit //");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			}
			else
				{
				System.out.println("***********************");

				for (int i=0 ; i< coAray ; i+=1) 
				System.out.println(receipt[i]);
				System.out.println("Total sum : "+sumTotal);
				System.out.println("Total Tax : "+sumTax);
				
				System.out.println("***********************");

				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("// thanks for your visit //");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
				}	
				
			
 }
}

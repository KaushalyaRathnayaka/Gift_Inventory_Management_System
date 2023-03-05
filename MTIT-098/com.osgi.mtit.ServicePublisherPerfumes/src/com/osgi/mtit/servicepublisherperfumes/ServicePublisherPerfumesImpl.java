package com.osgi.mtit.servicepublisherperfumes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServicePublisherPerfumesImpl implements ServicePublisherPerfumes {
	
	public void PerfumeService() {
		
		int answer = 0;
		
		do {
	        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println();
	        System.out.println("Give a Number to Select Accessory Category :");
			System.out.println();
			System.out.println("######################################");
			System.out.println("#                                    #");
			System.out.println("#     1. CALVIN KLEIN                #");
			System.out.println("#     2. VICTORIYA'S SECRET          #");
			System.out.println("#     3. VERSACE                     #");
			System.out.println("#     4. TOMMY HIFIGER               #");
			System.out.println("#                                    #");
			System.out.println("#    99. Go Back                     #");
			System.out.println("#                                    #");
			System.out.println("######################################");
			System.out.println();
			System.out.print("Enter Number: ");
	        try {
	        	answer = Integer.parseInt(in.readLine());
	        }
	        catch (NumberFormatException e) {
	            e.printStackTrace();
	        }
	        catch (IOException e2) {
	            e2.printStackTrace();
	        }
	        switch (answer) {
	            case 1: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  CALVIN KLEIN                                         |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Eternity Aqua for Men 100ml                       |     CK0001     |     21300.00     |       12   	|");
					System.out.println("| Calvin Klein Beauty 100ml                         |     CK0002     |     23600.00     |       15   	|");
					System.out.println("| CK Free for Men 50ml                              |     CK0003     |     18200.00     |       11      |");
					System.out.println("| CK Sheer Beauty 100ml                             |     CK0004     |     10400.00     |       15      |");
					System.out.println("| CK One Gold 100ml                                 |     CK0005     |     14600.00     |       14      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 2: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                         VICTORIA'S SECRET                                             |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Bombshell Eau de Parfum 50 ml                     |     VS0001     |     17500.00     |       15      |");
					System.out.println("| Love Addict Fragrance Mist 250ml                  |     VS0002     |      9500.00     |       25      |");
					System.out.println("| Beach Aroma Gift Box                              |     VS0003     |     15500.00     |       14      |");
					System.out.println("| Temptation Fragrance Mist 250ml                   |     VS0004     |     7400.00      |       18      |");
					System.out.println("| Coconut Passion Fragrance Mist 250ml              |     VS0005     |     7400.00      |       22      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 3: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  VERSACE                                               |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Versace Pour Homme 50 ml                          |     VR0001     |      14000.00     |       12      |");
					System.out.println("| Versace Eros EDT 50 ml                            |     VR0002     |      14600.00     |       16      |");
					System.out.println("| Versace Dylan Blue 50ml                           |     VR0003     |      12700.00     |       22      |");
					System.out.println("| Versace Eros 50ml                                 |     VR0004     |      14000.00     |       21      |");
					System.out.println("| Versace Bright Crystal 50 ml                      |     VR0005     |      10300.00     |       33      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 4: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  TOMMY HILFIGER                                       |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Tommy Eau De Toilette 100ml                       |     TH0001     |      9800.00     |       11      |");
					System.out.println("| Tommy Hilfiger Cologne 200ml                      |     TH0002     |     11200.00     |       14      |");
					System.out.println("| Impact Intense Perfume 100ml                      |     TH0003     |     10300.00     |       15      |");
					System.out.println("| Tommy Girl 100ml                                  |     TH0004     |      9800.00     |       17      |");
					System.out.println("| Hilfiger Woman Peach Blossom 100ml                |     TH0005     |     11200.00     |       18      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            
	            case 99: {
	                continue;
	            }
	            default: {
	            	System.out.println();
	                System.out.println("The number you entered is invalid!!!");
	                continue;
	            }
	        }
	    

		
			
		} while (answer != 99);
		
	};

}

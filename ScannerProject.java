import java.util.Scanner;

public class InputOutput 
{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			// Prompts user which program they desire to use
			System.out.println("Choose the following program: \n"); 
			System.out.println("[1] Statistics Program");
			System.out.println("[2] Star Wars Name Generator");
			System.out.print("\nProgram Select: ");
			
			// If either integer '1' or '2' is entered
			if (in.hasNextLine()){
				int check = in.nextInt();
				if (check == 1){
					statistics();
				}
				else if (check == 2){
					starWars();
				}
				// If integer '1' or '2' is not labeled as input, error message is shown
				else{
					System.out.print("Not an option. Try Again.");
				}
			}
		}
		
		public static void statistics(){
			Scanner stat = new Scanner(System.in);
			
			// Prompts the user
			System.out.println("\nStatistics Program");
			System.out.println("------------------");
			System.out.println("How many numbers would you like to enter?");
			int sum = 0;
			if (stat.hasNextInt())
			{
				int amount = stat.nextInt();
				// for() loop to print desired numbers chosen by user
				for (int i = 1; i <= amount; ++i)
				{
					System.out.print("Enter number " + i + ": ");
				    if (stat.hasNextInt())
				    {
				    	sum += stat.nextInt();
				    }
				 }
				        
			// Calculates the average of the sum of the values inputed
			double mean = sum / (double)amount;
			System.out.println("------------------");
			System.out.println("Statistical Calculations are: ");
			System.out.println("\tSum: " + sum);
			System.out.println("\tMean: " + mean);
			}
			else{
				System.out.print("Error: Try again [Y/N]? ");
				if (stat.hasNextLine())
				{								
					if (stat.next().toLowerCase().equals("Y") || stat.next().toLowerCase().equals("y"))
					{	
						statistics();
					}
					else{
						System.out.print("Restart program!");
					}
				}
			}
		}

		public static void starWars(){
			Scanner sw = new Scanner(System.in);
			String first = "";
			String middle = "";
			String last = "";
			String town = "";
					
			// Prompts the user
			System.out.println("\nStar Wars Name ");
			System.out.println("------------------"); 
			System.out.println("Please enter the following information to determine your Star Wars Name!");
			
			// Stores names
			System.out.print("First Name: ");
			if (sw.hasNextInt())
			{
				System.out.print("Error: Try again [Y/N]? ");
				if (sw.hasNextLine())
				{								
					if (sw.next().toLowerCase().equals("Y") || sw.next().toLowerCase().equals("y"))
					{	
						starWars();
					}
					else 
					{
						System.out.print("Restart program!");
					}
				}
			}
			else 
			{
				if (sw.hasNextLine())
				{
					first = sw.next();
					System.out.print("Middle Name: ");
					if (sw.hasNext()){
						middle = sw.next();
						System.out.print("Last Name: ");
						if (sw.hasNext()){
							last = sw.next();
							System.out.print("Town of Birth: ");
							town = sw.next();
						}
					}
				}
			}
		            
			//Uses the Star Wars formula to generate a new String and name for the user
		    String newFirst = last.substring(0,1).toUpperCase() + (last.substring(1, 3) + first.substring(0, 2)).toLowerCase();
		    String newLast = middle.substring(0,1).toUpperCase() + (middle.substring(1, 2) + town.substring(0, 3)).toLowerCase();
	        String newFull = "\t" + newFirst + " " + newLast;
		
	        // Prints the final result
			System.out.println("------------------"); 
			System.out.println("Your Star Wars Name is:");
			System.out.print(newFull);
	    }
}
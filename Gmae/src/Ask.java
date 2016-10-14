import java.util.Scanner;

public class Ask
	{
	static Integer userScore=0;
	static Integer totalScore=0;
		public static void One()
			{
				String Snack1 = "Snack x = new Snack();";
				String run1 = "x.Snacksare1()";
				
				
				System.out.println("If the code runs:");
				System.out.println(Snack1);
				System.out.println(run1);
				System.out.println("What will the result be? A. Snacks are delicious  B. There isn't a 'best' snack  C. FRUIT IS DA BEST D. The code will not execute");

				Scanner userInput2 = new Scanner (System.in);
					
				String userGuess = userInput2.nextLine();

				if (userGuess.equals("A") || userGuess.equals("a") )
						{
					
					userScore++;
					System.out.println("Correct");
					totalScore++;
						}
				
				else
					{
					System.out.println("Incorrect");
					totalScore++;	
					}
			}
		public static void Two()
			{
				String Snack1 = "Snack x = new Snack();";
				String run1 = "x.Snacksare2()";
				
				
				System.out.println("If the code runs:");
				System.out.println(Snack1);
				System.out.println(run1);
				System.out.println("What will the result be? A. Snacks are delicious  B. There isn't a 'best' snack  C. FRUIT IS DA BEST D. The code will not execute");

				Scanner userInput2 = new Scanner (System.in);
					
				String userGuess = userInput2.nextLine();

				if (userGuess.equals("B") || userGuess.equals("b") )
						{
					userScore++;
					System.out.println("Correct");
					totalScore++;
						}
				
				else
					{
					System.out.println("Incorrect");
					totalScore++;	
					}
			}
		public static void Three()
			{
				String Snack1 = "Snack x = new Snack();";
				String run1 = "x.Fruitis1()";
				
				
				System.out.println("If the code runs:");
				System.out.println(Snack1);
				System.out.println(run1);
				System.out.println("What will the result be? A. Snacks are delicious  B. There isn't a 'best' snack  C. FRUIT IS DA BEST D. The code will not execute");

				Scanner userInput2 = new Scanner (System.in);
					
				String userGuess = userInput2.nextLine();

				if (userGuess.equals("D") || userGuess.equals("d") )
						{
					userScore++;
					System.out.println("Correct");
					totalScore++;
						}
				
				else
					{
					System.out.println("Incorrect");
					totalScore++;
					}
			}
		public static void Four()
			{
				String Snack1 = "Snack x = new Fruit();";
				String run1 = "x.Snacksare1()";
				
				
				System.out.println("If the code runs:");
				System.out.println(Snack1);
				System.out.println(run1);
				System.out.println("What will the result be? A. There isn't a 'best' snack  B. Snacks are delicious  C. The code will not execute D. FRUIT IS DA BEST ");

				Scanner userInput2 = new Scanner (System.in);
					
				String userGuess = userInput2.nextLine();

				if (userGuess.equals("B") || userGuess.equals("b") )
						{
					userScore++;
					System.out.println("Correct");
					totalScore++;
						}
				
				else
					{
					System.out.println("Incorrect");
					totalScore++;	
					}
			}
		public static void Five()
			{
				String Snack1 = "Snack x = new Fruit();";
				String run1 = "x.Snacksare2()";
				
				
				System.out.println("If the code runs:");
				System.out.println(Snack1);
				System.out.println(run1);
				System.out.println("What will the result be? A. There isn't a 'best' snack  B. Snacks are delicious  C. The code will not execute D. FRUIT IS DA BEST ");

				Scanner userInput2 = new Scanner (System.in);
					
				String userGuess = userInput2.nextLine();

				if (userGuess.equals("D") || userGuess.equals("d") )
						{
					userScore++;
					System.out.println("Correct");
					totalScore++;
						}
				
				else
					{
					System.out.println("Incorrect");
					totalScore++;	
					}
			}
		public static void Six()
			{
				String Snack1 = "Snack x = new Fruit();";
				String run1 = "x.Fruitis1()";
				
				
				System.out.println("If the code runs:");
				System.out.println(Snack1);
				System.out.println(run1);
				System.out.println("What will the result be? A. There isn't a 'best' snack  B. Snacks are delicious  C. The code will not execute D. FRUIT IS DA BEST ");

				Scanner userInput2 = new Scanner (System.in);
					
				String userGuess = userInput2.nextLine();

				if (userGuess.equals("C") || userGuess.equals("c") )
						{
					userScore++;
					System.out.println("Correct");
					totalScore++;
						}
				
				else
					{
					System.out.println("Incorrect");
					totalScore++;
					}
			}
		public static void Seven()
		{
			String Snack1 = "Fruit x = new Snack();";
			String run1 = "x.Snacksare1()";
			
			
			System.out.println("If the code runs:");
			System.out.println(Snack1);
			System.out.println(run1);
			System.out.println("What will the result be? A. The code will not execute  B. FRUIT IS DA BEST  C.There isn't a 'best' snack  D. Snacks are delicious");

			Scanner userInput2 = new Scanner (System.in);
				
			String userGuess = userInput2.nextLine();

			if (userGuess.equals("A") || userGuess.equals("a") )
					{
				userScore++;
				System.out.println("Correct");
				totalScore++;
					}
			
			else
				{
				System.out.println("Incorrect");
				totalScore++;
				}
		}
	public static void Eight()
		{
			String Snack1 = "Fruit x = new Snack();";
			String run1 = "x.Snacksare2()";
			
			
			System.out.println("If the code runs:");
			System.out.println(Snack1);
			System.out.println(run1);
			System.out.println("What will the result be? A. The code will not execute  B. FRUIT IS DA BEST  C.There isn't a 'best' snack  D. Snacks are delicious");

			Scanner userInput2 = new Scanner (System.in);
				
			String userGuess = userInput2.nextLine();

			if (userGuess.equals("A") || userGuess.equals("a") )
					{
				
				userScore++;
				System.out.println("Correct");
				totalScore++;
					}
			
			else
				{
				System.out.println("Incorrect");
				totalScore++;
				}
		}
	public static void Nine()
		{
			String Snack1 = "Fruit x = new Snack();";
			String run1 = "x.Fruitis1()";
			
			
			System.out.println("If the code runs:");
			System.out.println(Snack1);
			System.out.println(run1);
			System.out.println("What will the result be? A. The code will not execute  B. FRUIT IS DA BEST  C.There isn't a 'best' snack  D. Snacks are delicious");

			Scanner userInput2 = new Scanner (System.in);
				
			String userGuess = userInput2.nextLine();

			if (userGuess.equals("A") || userGuess.equals("a") )
					{
				userScore++;
				System.out.println("Correct");
				totalScore++;
					}
			
			else
				{
				System.out.println("Incorrect");
				totalScore++;
		
	}
			int percentage = (userScore/totalScore);
					System.out.println("Your score is: "+ userScore + "/" + totalScore);
}
	public static void Ten()
	{
		String Snack1 = "Fruit x = new Fruit();";
		String run1 = "x.Snacksare1()";
		
		
		System.out.println("If the code runs:");
		System.out.println(Snack1);
		System.out.println(run1);
		System.out.println("What will the result be? A. There isn't a 'best' snack  B. Snacks are delicious  C. FRUIT IS DA BEST D. The code will not execute");

		Scanner userInput2 = new Scanner (System.in);
			
		String userGuess = userInput2.nextLine();

		if (userGuess.equals("B") || userGuess.equals("b") )
				{
			userScore++;
			System.out.println("Correct");
			totalScore++;
				}
		
		else
			{
			System.out.println("Incorrect");
			totalScore++;
			}
	}
public static void Eleven()
	{
		String Snack1 = "Fruit x = new Fruit();";
		String run1 = "x.Snacksare2()";
		
		
		System.out.println("If the code runs:");
		System.out.println(Snack1);
		System.out.println(run1);
		System.out.println("What will the result be? A. Snacks are delicious  B. The code will not execute  C. FRUIT IS DA BEST D. There isn't a 'best' snack");

		Scanner userInput2 = new Scanner (System.in);
			
		String userGuess = userInput2.nextLine();

		if (userGuess.equals("C") || userGuess.equals("c") )
				{
			userScore++;
			System.out.println("Correct");
			totalScore++;
				}
		
		else
			{
			System.out.println("Incorrect");
			totalScore++;
			}
	}
public static void Twelve()
	{
		String Snack1 = "Fruit x = new Fruit();";
		String run1 = "x.Fruitis1()";
		
		
		System.out.println("If the code runs:");
		System.out.println(Snack1);
		System.out.println(run1);
		System.out.println("What will the result be? A. Fruit is sweet  B. FRUIT IS DA BEST  C.  The code will not execute D. There isn't a 'best' snack");

		Scanner userInput2 = new Scanner (System.in);
			
		String userGuess = userInput2.nextLine();

		if (userGuess.equals("A") || userGuess.equals("a") )
				{
			
			userScore++;
			System.out.println("Correct");
			totalScore++;
				}
		
		else
			{
			System.out.println("Incorrect");
			totalScore++;
	}
	}
}
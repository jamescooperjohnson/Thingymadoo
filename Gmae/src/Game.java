import java.util.Scanner;

public class Game
	{

		public static void main(String[] args)
			{
System.out.println("How many questions would you like to have in this short quiz? (max 12)");
				
				Scanner userInput = new Scanner (System.in);
					
			int choice = userInput.nextInt();
			
			if (choice == 1 )
				{
				Ask.Nine();	
				}
			if (choice == 2)
				{
				
				Ask.One();
				Ask.Nine();
				}
			if (choice == 3 )
					{
				Ask.One();
				Ask.Three();
				Ask.Nine();
				
					}
			if (choice == 4)
					{
				Ask.Twelve();
				Ask.Four();	
				Ask.Two();
				Ask.Nine();
			
					}
			if (choice == 5 )
				{
				Ask.Eight();
				Ask.One();
				Ask.Two();
				Ask.Twelve();
				Ask.Nine();
				}
			if (choice == 6)
				{
				Ask.Twelve();
				Ask.Three();
				Ask.Two();
				Ask.Four();
				Ask.Five();
				Ask.Nine();
				}
			if (choice == 7 )
					{
				Ask.Seven();
				Ask.Three();
				Ask.Twelve();
				Ask.Four();
				Ask.Five();
				Ask.Six();
				Ask.Nine();
					}
			if (choice == 8)
					{
				Ask.Eight();
				Ask.Two();
				Ask.Six();
				Ask.Twelve();
				Ask.One();
				Ask.Three();
				Ask.Seven();
				Ask.Nine();
			
					}
			if (choice == 9 )
				{
				Ask.Eleven();
				Ask.Four();
				Ask.Two();
				Ask.Five();
				Ask.Three();
				Ask.Eight();
				Ask.Seven();
				Ask.Ten();
				Ask.Nine();
				}
			if (choice == 10)
				{
				Ask.Ten();
				Ask.Four();
				Ask.Two();
				Ask.Five();
				Ask.Three();
				Ask.Eight();
				Ask.Seven();
				Ask.One();
				Ask.Six();
				Ask.Nine();
	
				}
			if (choice == 11 )
				{
				Ask.Ten();
				Ask.Four();
				Ask.Two();
				Ask.Five();
				Ask.Three();
				Ask.Eight();
				Ask.Seven();
				Ask.Eleven();
				Ask.Six();
				Ask.One();
				Ask.Nine();
				}
			if (choice == 12)
				{
				
				Ask.Eleven();
				Ask.Ten();
				Ask.Four();
				Ask.Two();
				Ask.Five();
				Ask.Three();
				Ask.Eight();
				Ask.Seven();
				Ask.Twelve();
				Ask.Six();
				Ask.One();
				Ask.Nine();
	
				}	
			}

	}

import java.util.Scanner;

public class Game
	{

		public static void main(String[] args)
			{
System.out.println("How many questions would you like to have in this short quiz? (max 8)");
				
				Scanner userInput = new Scanner (System.in);
					
			int choice = userInput.nextInt();
			
			if (choice == 1 )
				{
				Ask.One();	
				}
			if (choice == 2)
				{
				Ask.One();
				Ask.Two();
				}
			if (choice == 3 )
					{
				Ask.One();
				Ask.Two();
				Ask.Three();
					}
			if (choice == 4)
					{
				Ask.One();
				Ask.Two();	
				Ask.Three();
				Ask.Four();
			
					}
			if (choice == 5 )
				{
				Ask.One();
				Ask.Two();
				Ask.Three();
				Ask.Four();
				Ask.Five();
				}
			if (choice == 6)
				{
				Ask.One();
				Ask.Two();
				Ask.Three();
				Ask.Four();
				Ask.Five();
				Ask.Six();
				}
			if (choice == 7 )
					{
						
					}
			if (choice == 8)
					{
						
			
					}
					
			}

	}

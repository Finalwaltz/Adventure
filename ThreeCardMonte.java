import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int play = 1;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		while (play == 1)
		{
			start();
			int guess = input.nextInt();
			invalid(guess);
			int ace = 1 + r.nextInt(3);
			if (guess == 1)
			{
				if (ace == 1)
					win1();
				else if (ace == 2)
					lose2();
				else
					lose3();
			}
			else if (guess == 2)
			{
				if (ace == 1)
					lose1();
				else if (ace == 2)
					win2();
				else
					lose3();
			}
			else
			{
				if (ace == 1)
					lose1();
				else if (ace == 2)
					lose2();
				else
					win3();
			}
			play = playAgain();
		}
		
	}
	
	public static void start()
	{
		System.out.println("+-------------------------------Three Card Monte!------------------------------+");
		System.out.println("|                                                                              |");
		System.out.println("|                                                                              |");
		System.out.println("|    You slide up to Fast Eddie's card table and plop down your cash.          |");
		System.out.println("|    He glances at you out of the corner of his eye and starts shuffling.      |");
		System.out.println("|    He lays down three cards.                                                 |");
		System.out.println("|                                                                              |");
		System.out.println("|    Which one is the ace?                                                     |");
		System.out.println("|                                                                              |");
		System.out.println("|                                 ###  ###  ###                                |");
		System.out.println("|                                 ###  ###  ###                                |");
		System.out.println("|                                 ###  ###  ###                                |");
		System.out.println("|                                  1    2    3                                 |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.print("> ");
	}
	
	public static int invalid(int in)
	{
		Scanner input = new Scanner(System.in);
		while (in != 1 && in != 2 && in != 3)
		{
			System.out.println("Invalid response! Try again.");
			System.out.print("> ");
			in = input.nextInt();
		}
		return in;
	}
	
	public static void win1()
	{
		System.out.println("+-----------------------------------Success!-----------------------------------+");
		System.out.println("|                                                                              |");
		System.out.println("|    You nailed it! Fast Eddie reluctantly hands over your winnings, scowling. |");
		System.out.println("|                                                                              |");
		System.out.println("|                                 AAA  ###  ###                                |");
		System.out.println("|                                 AAA  ###  ###                                |");
		System.out.println("|                                 AAA  ###  ###                                |");
		System.out.println("|                                  1    2    3                                 |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
	}
	
	public static void win2()
	{
		System.out.println("+-----------------------------------Success!-----------------------------------+");
		System.out.println("|                                                                              |");
		System.out.println("|    You nailed it! Fast Eddie reluctantly hands over your winnings, scowling. |");
		System.out.println("|                                                                              |");
		System.out.println("|                                 ###  AAA  ###                                |");
		System.out.println("|                                 ###  AAA  ###                                |");
		System.out.println("|                                 ###  AAA  ###                                |");
		System.out.println("|                                  1    2    3                                 |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
	}
	
	public static void win3()
	{
		System.out.println("+-----------------------------------Success!-----------------------------------+");
		System.out.println("|                                                                              |");
		System.out.println("|    You nailed it! Fast Eddie reluctantly hands over your winnings, scowling. |");
		System.out.println("|                                                                              |");
		System.out.println("|                                 ###  ###  AAA                                |");
		System.out.println("|                                 ###  ###  AAA                                |");
		System.out.println("|                                 ###  ###  AAA                                |");
		System.out.println("|                                  1    2    3                                 |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
	}
	
	public static void lose1()
	{
		System.out.println("+-----------------------------------Failure!-----------------------------------+");
		System.out.println("|                                                                              |");
		System.out.println("|    Ha! Fast Eddie wins again! The ace was card number 1.                     |");
		System.out.println("|                                                                              |");
		System.out.println("|                                 AAA  ###  ###                                |");
		System.out.println("|                                 AAA  ###  ###                                |");
		System.out.println("|                                 AAA  ###  ###                                |");
		System.out.println("|                                  1    2    3                                 |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
	}
	
	public static void lose2()
	{
		System.out.println("+-----------------------------------Failure!-----------------------------------+");
		System.out.println("|                                                                              |");
		System.out.println("|    Ha! Fast Eddie wins again! The ace was card number 2.                     |");
		System.out.println("|                                                                              |");
		System.out.println("|                                 ###  AAA  ###                                |");
		System.out.println("|                                 ###  AAA  ###                                |");
		System.out.println("|                                 ###  AAA  ###                                |");
		System.out.println("|                                  1    2    3                                 |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
	}
	
	public static void lose3()
	{
		System.out.println("+-----------------------------------Failure!-----------------------------------+");
		System.out.println("|                                                                              |");
		System.out.println("|    Ha! Fast Eddie wins again! The ace was card number 3.                     |");
		System.out.println("|                                                                              |");
		System.out.println("|                                 ###  ###  AAA                                |");
		System.out.println("|                                 ###  ###  AAA                                |");
		System.out.println("|                                 ###  ###  AAA                                |");
		System.out.println("|                                  1    2    3                                 |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
	}
	
	public static int playAgain()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("|                                                                              |");
		System.out.println("|    Play again?                                                               |");
		System.out.println("|                                                                              |");
		System.out.println("|                           0. NO                1. YES                        |");
		System.out.println("|                                                                              |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.print("> ");
		int in = input.nextInt();
		while (in != 0 && in != 1)
		{
			System.out.println("+------------------------------------------------------------------------------+");
			System.out.println("|                                                                              |");
			System.out.println("|                        Invalid response! Try again!                          |");
			System.out.println("|                                                                              |");
			System.out.println("+------------------------------------------------------------------------------+");
			System.out.print("> ");
			in = input.nextInt();
		}
		return in;
	}
}
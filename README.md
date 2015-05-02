# Adventure
import java.util.Random;

public class FortuneCookie
{
	public static void main(String[] args)
	{
		fortune();
		lotto();
	}
	
	public static void fortune()
	{
		Random r = new Random();
		int fort = 1 + r.nextInt(6);
		System.out.println();
		System.out.println();
		switch (fort)
		{
			case 1:
				System.out.println("People are naturally attracted to you.");
				break;
			case 2:
				System.out.println("You learn from your mistakes... You will learn a lot today.");
				break;
			case 3:
				System.out.println("A dream you have will come true.");
				break;
			case 4:
				System.out.println("You will marry your lover.");
				break;
			case 5:
				System.out.println("A very attractive person has a message for you.");
				break;
			case 6:
				System.out.println("Wealth awaits you very soon.");
				break;
		}
	}
	
	public static void lotto()
	{
		Random r = new Random();
		System.out.println();
		System.out.println("Lucky numbers: " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)));
	}
}

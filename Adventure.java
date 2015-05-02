//	package ifstatements;

import java.util.Scanner;

public class Adventure
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
//		Begin. Stay the orc!		
		start();
		String a = input.nextLine();
		a = invalid("sword", "shortbow", a);
//		Choose the sword
		if (a.equals("sword"))
		{
			sword();
			a = input.nextLine();
			a = invalid("throat", "arm", a);
//			Choose the sword > throat
			if (a.equals("throat"))
			{
				swordThroat();
				a = input.nextLine();
				a = invalid("door", "block", a);
//				Choose the sword > throat > door
				if (a.equals("door"))
				{
					swordThroatDoor();
				}
//				Choose sword > throat > block
				else
				{
					swordThroatBlock();
				}
			}
//			Choose sword > arm
			else if (a.equals("arm"))
			{
				swordArm();
				a = input.nextLine();
				a = invalid("heart", "head", a);
//			Choose sword > arm > heart	
				if (a.equals("heart"))
				{
					swordArmHeart();
				}
//				Choose sword > arm > head
				else
				{
					swordArmHead();
				}
			}
		}
//		Choose bow
		else
		{
			bow();
			a = input.nextLine();
			a = invalid("stairs", "shot", a);
//			Choose bow > stairs
			if (a.equals("stairs"))
			{
				bowStairs();
				a = input.nextLine();
				a = invalid("kill", "cripple", a);
//				Choose bow > stairs > kill
				if (a.equals("kill"))
				{
					bowStairsKill();
				}
//				Choose bow > stairs > Cripple
				else
				{
					bowStairsCripple();
				}
			}
//			Choose bow > shot
			else if (a.equals("shot"))
			{
				bowShot();
				a = input.nextLine();
				a = invalid("door", "shoot", a);
//				Choose bow > shot > door
				if (a.equals("door"))
				{
					bowShotDoor();
				}
//				Choose bow > shot > shoot
				else
				{
					bowShotShoot();
				}
			}
		}
	}
	
	public static String invalid(String inv1, String inv2, String val)
	{
		Scanner input = new Scanner(System.in);
		while (!val.equals(inv1) && !val.equals(inv2))
		{
			System.out.println();
			System.out.println("Invalid response! Try again!");
			System.out.print("> ");
			val = input.nextLine();
		}
		return val;
	}
	
	public static void start()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                      SLAY THE ORC!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You wake up with a sharp pain in your neck and your vision is blurry.");
		System.out.println("You find yourself in an old run-down house. On the other side of the room,");
		System.out.println("an orc notices you waking up and begins to charge! Quickly surveying the");
		System.out.println("room, you see next to you two fallen comrades--still clutching their weapons.");
		System.out.println("To your right, the soldier holds a one-handed \"sword\". To your left, a");
		System.out.println("comrade holds a wooden \"shortbow\".");
		System.out.println();
		System.out.println("Which do you choose? (sword or shortbow)");
		System.out.print("> ");
	}
	
	public static void sword()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\'A sword!\' you exclaim as you ready the blade. The orc is nearly");
		System.out.println("within reach.");
		System.out.println();
		System.out.println("Do you swing for: his \"throat\" or his attacking \"arm\"?");
		System.out.print("> ");
	}

	public static void swordThroat()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Your arms barely get the chance to start swinging before the orc swings");
		System.out.println("his mace at your knees. You drop to the floor with a *thud*. The orc winds");
		System.out.println("up to swing again!");
		System.out.println();
		System.out.println("Do you crawl for the \"door\" or \"block\" the next swing with your sword?");
		System.out.println("> ");
	}
	
	public static void swordThroatDoor()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("As you turn around to crawl for the door, the orc strikes you at the");
		System.out.println("top of your spine, instantly killing you. Thanks for playing.");
		System.out.println("");
		System.out.print("YOU ARE DEAD");
	}
	
	public static void swordThroatBlock()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You brace your sword for impact. Your mind races as the events");
		System.out.println("before you unfold. One moment you were doomed, then the next moment");
		System.out.println("the orc is on his knees. His mace shattered from the block and he's");
		System.out.println("holding his arm while backing up. You can only guess that the expression");
		System.out.println("on his face is fear, but what difference does it make?  You stab him");
		System.out.println("through the throat and walk out.");
		System.out.println();
		System.out.print("YOU WIN");
	}
	
	public static void swordArm()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("The orc's forearm is cut wide open!  He's reeling in pain, how");
		System.out.println("do you proceed?");
		System.out.println();
		System.out.print("Stab him through the \"heart\" or have the blade come down on his \"head\"!");
		System.out.println("> ");
	}
	
	public static void swordArmHeart()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Your blade goes straight through his heart. His blood spills all over");
		System.out.println("the floor as he collapses onto the wall beside you. \'It's over,\' ");
		System.out.println("you sigh.");
		System.out.println();
		System.out.print("YOU WIN");
	}
	
	public static void swordArmHead()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You swing you sword as hard as you can into the orc's skull. \'It's now");
		System.out.println("or never\' is the only thought going through your mind as the orc's");
		System.out.println("eyes roll behind his head and he collapses to his knees. You can't");
		System.out.println("help but wonder how many more battles will end like this. \'Not many");
		System.out.println("more,\' you chuckle under your breath.");
		System.out.println();
		System.out.print("YOU WIN");
	}
	
	public static void bow()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You decide to go with your instincts and draw the bow. Using your tactical");
		System.out.println("experience, you quickly scan the room for a choke point or finding higher");
		System.out.println("ground. There are stairs to your left and not much else. A run for the door");
		System.out.println("is much too late now.");
		System.out.println();
		System.out.println("Run for the \"stairs\" or take the \"shot\"?");
		System.out.print("> ");
	}
	
	public static void bowStairs()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Quickly, you bolt up the stairs before the orc can touch you. Before");
		System.out.println("you know it, you're faced with a very favorable situation: you at the top");
		System.out.println("of the stairs, the orc at the bottom.");
		System.out.println();
		System.out.println("Aim to \"kill\" or \"cripple\" the poor bastard?");
		System.out.print("> ");
	}
	
	public static void bowStairsKill()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You put the orc out of its misery. He was only doing his job, and you");
		System.out.println("HAD to ruin his day. I suppose it was you or him--today the Gods favor you.");
		System.out.println();
		System.out.print("YOU WIN");
	}
	
	public static void bowStairsCripple()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("The orc takes two arrows to both knees and collapses at the foot of the");
		System.out.println("stairs. He groans as he tirelessly tries to walk up the stairs. He passes");
		System.out.println("out from exhaustion and you tie his arms and set him in the corner.");
		System.out.println("                           Waiting for answers.");
		System.out.println();
		System.out.print("                                   YOU WIN");
	}
	
	public static void bowShot()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You release the arrow on a whim... A direct hit! His left eye is completely");
		System.out.println("destroyed, but... But he's still charging! You're running out options!");
		System.out.println();
		System.out.println("Make a break for the \"door\"! Or \"shoot\" again?");
		System.out.print(":> ");
	}
	
	public static void bowShotDoor()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Reaching for the door, you get caught by the orc! He flips you on your");
		System.out.println("              back and breaks open your chest with his mace.");
		System.out.println();
		System.out.print("                             YOU ARE DEAD");
	}
	
	public static void bowShotShoot()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You nock your bow as quickly as you can, but before you release");
		System.out.println("the string the orc strikes you on your temple. Lights out for you.");
		System.out.println();
		System.out.print("                           YOU ARE DEAD");
	}
	
}




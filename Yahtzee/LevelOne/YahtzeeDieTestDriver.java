public class YahtzeeDieTestDriver
{

	public static void main(String args[])
	{
		System.out.println("Yahtzee Die Test Driver Program");

		YahtzeeDie die2;
		YahtzeeDie die4;
		YahtzeeDie die6;

		System.out.print("Initialization Test: ");
		die2=new YahtzeeDie(2);
		die4=new YahtzeeDie(4);
		die6=new YahtzeeDie(6);


		System.out.println();
		System.out.println("Roll Dice Test:");
		for(int i=0; i<25;i++)
		{
			System.out.println(die2.getValue()+ " " + die4.getValue() + " " + die6.getValue());
			die2.rollDie();
			die4.rollDie();
			die6.rollDie();
		}
		System.out.println();
		System.out.println("Is Frozen Test:");
		System.out.println("Die 2:" +die2.isFrozen()+ " \tDie 4:"+die4.isFrozen() + " \tDie 6:"+die6.isFrozen());
		System.out.println("Freeze Die 2");
		die2.freezeDie();
		System.out.println("Die 2:" +die2.isFrozen()+ " \tDie 4:"+die4.isFrozen() + " \tDie 6:"+die6.isFrozen());
		System.out.println("Freeze Die 4");
		die4.freezeDie();
		System.out.println("Die 2:" +die2.isFrozen()+ " \tDie 4:"+die4.isFrozen() + " \tDie 6:"+die6.isFrozen());
		System.out.println("Freeze Die 6");
		die6.freezeDie();
		System.out.println("Die 2:" +die2.isFrozen()+ " \tDie 4:"+die4.isFrozen() + " \tDie 6:"+die6.isFrozen());
		System.out.println("Unfreeze Die 6");
		die6.unfreezeDie();
		System.out.println("Die 2:" +die2.isFrozen()+ " \tDie 4:"+die4.isFrozen() + " \tDie 6:"+die6.isFrozen());
		System.out.println("Unfreeze Die 4");
		die4.unfreezeDie();
		System.out.println("Die 2:" +die2.isFrozen()+ " \tDie 4:"+die4.isFrozen() + " \tDie 6:"+die6.isFrozen());
		System.out.println("Unfreeze Die 2");
		die2.unfreezeDie();
		System.out.println("Die 2:" +die2.isFrozen()+ " \tDie 4:"+die4.isFrozen() + " \tDie 6:"+die6.isFrozen());
		System.out.println();
	}
}
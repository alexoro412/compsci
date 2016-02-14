public class MyArrayListDriver
{
	public static void main(String[]args)
	{

		/* TESTING DEFAULT CONSTRUCTORS, SIZE, ADD, AND GET */
		MyArrayList a=new MyArrayList();

		a.add("You");
		a.add("have");
		a.add("passed");
		a.add("the");
		a.add("following");
		a.add("tests:");
		a.add("Default");
		a.add("constructor,");
		a.add("add at end,");
		a.add("get,");
		a.add("double capacity,");
		a.add("and");
		a.add("size. ");

		for(int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i)+ " ");
			if(i==5)System.out.println();
		}
		System.out.println();

		/* TESTING INITIAL CAPACITY CONSTRUCTOR AND ADD AT INDEX */
		MyArrayList aa=new MyArrayList(3);
		aa.add(0, "index tests!");
		aa.add(0, "You passed");
		aa.add(1, "initial capacity constructor");
		aa.add(2 , "and the");


		System.out.println();
		for(int i=0; i<aa.size(); i++)
		{
			System.out.print(aa.get(i)+ " ");
		}

		System.out.println();
		System.out.println();


		/* TESTING SET */
		MyArrayList b=new MyArrayList(3);
		b.add("You");
		b.add("failed");
		b.add("the set");
		b.add("test!");
		String s=(String)(b.set(1, "passed"));

		for(int i=0; i<b.size(); i++)
		{
			System.out.print(b.get(i)+ " ");
		}
		System.out.println();
		System.out.println("You " + s + " not.");
		System.out.println();

		/* TESTING REMOVE */
		MyArrayList d=new MyArrayList(8);
		d.add("Nope,");
		d.add("You");
		d.add("did");
		d.add("not");
		d.add("not");
		d.add("pass");
		d.add("the");
		d.add("remove");
		d.add("test!");
		d.add("NOT!!!");
		String e=(String)(d.remove(9));
		String f=(String)(d.remove(3));
		String g=(String)(d.remove(3));
		String h=(String)(d.remove(0));

		for(int i=0; i<d.size(); i++)
		{
			System.out.print(d.get(i)+ " ");
		}
		System.out.println();
		System.out.println(h + " it did " + g + " fail.  It did " + f + " fail.  IT FAILED " + e);
		System.out.println();
	}
}

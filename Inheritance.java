public class Inheritance
{
	public static void main(String args[])
	{	
		flying ff = new flying();
		ff.display();
		non_flying nf = new non_flying();
		nf.display();
	}

}


class Birds
{
	public int wings;
	public String BName;

	public void Fly(String BirdName)
	{
		System.out.println(BirdName + " has " + wings + " wings and can fly!!");
	}

	public void NotFly(String BirdName, String colour)
	{
		System.out.println(BirdName + " has " + wings + " wings and cannot fly!!");
		System.out.println("They have a color of " + colour + " and are beautiful!!");
	}

}


class flying extends Birds
{
	void display()
	{
		Birds objBirds = new Birds();
		objBirds.BName = "Eagle";
		objBirds.wings = 2;
		objBirds.Fly(objBirds.BName);
	}
}


class non_flying extends Birds
{
	String FBColor = "White";
	Birds objBirds = new Birds();
	void display()
	{
		objBirds.BName = "Cock";
		objBirds.wings = 1;
		objBirds.NotFly(objBirds.BName, FBColor);
	}
	
}
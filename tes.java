public class tes{
	int a; double b;

	//constuctor default
	public tes()
	{
	a = 12;
	b = 4.0;
	}

	//constructor parameter
	public tes(int x){
	a = x;
	}

public static void main(String[] args)
	{
	tes tes1 = new tes();
	tes tes2 = new tes(50);

	System.out.println(tes1.b);
	System.out.println(tes2.a);
	}
}
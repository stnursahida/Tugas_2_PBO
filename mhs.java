public class mhs{
	String a,b,c;//anggota class
	public mhs(String nama, String nim, String fak)
	{
	//constructor parameter
		a = nama;
		b = nim;
		c = fak;
	}

public static void main(String[] args)
	{
		mhs mhs1 = new mhs("Siti Nursahida Imlan","13020180104","Ilmu Komputer");
		//constructor parameter
		System.out.println ("Nama		: "+(mhs1.a));
		System.out.println ("Nim		: "+(mhs1.b));
		System.out.println ("Fakultas	: "+(mhs1.c));
	}
}
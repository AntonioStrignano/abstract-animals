package Es2;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("======CANE======");
		Animale cane = new Cane ();
		cane.dormi();
		cane.verso();
		cane.mangia();
		System.out.println("================\n===PASSEROTTO===");
		Animale pass = new Passerotto ();
		pass.dormi();
		pass.verso();
		pass.mangia();
		System.out.println("================\n=====AQUILA=====");
		Animale aquila = new Aquila();
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		System.out.println("================\n=====DELFINO====");
		Animale delf = new Delfino();
		delf.dormi();
		delf.verso();
		delf.mangia();
		System.out.println("================");
		faiVolare((Volatile) aquila);
		faiVolare((Volatile) pass);
		faiNuotare((Nuotante) delf);
		
		
		
	}

	private static void faiVolare(Volatile animale) {
		animale.vola();
	}
	private static void faiNuotare(Nuotante animale) {
		animale.nuota();
	}
}

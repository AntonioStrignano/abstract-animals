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
		Volatile aquila2 = new Aquila();
		faiVolare(aquila2);
		Volatile pass2 = new Passerotto();
		faiVolare(pass2);
		faiNuotare((Nuotante) delf);
		// anche se e' lo stesso oggetto modificato di tipo, ma rimane coerente in quanto Delfino, quindi sia un Animale per heritage della classe
		// e Nuotante per l'interfaccia Nuotante implementato in Delfino.
		// creare un nuovo delfino vuol dire creare un oggetto Delfino, figlio di Animale e implementato con Nuotante
		
		
		
	}

	private static void faiVolare(Volatile animale) {
		animale.vola();
	}
	private static void faiNuotare(Nuotante animale) {
		animale.nuota();
	}
}

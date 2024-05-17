package Es1;

public class Main {

	public static void main(String[] args) {
		System.out.println("======CANE======");
		Animale cane = new Cane ("abbaio", "onnivora");
		cane.dormi();
		cane.verso();
		cane.mangia();
		System.out.println("================\n===PASSEROTTO===");
		Animale pass = new Passerotto ("cinguettio", "fiocchi d'avena, noci e nocciole, uvette e frutta");
		pass.dormi();
		pass.verso();
		pass.mangia();
		System.out.println("================\n=====AQUILA=====");
		Animale aquila = new Aquila("strido", "piccoli e medi mammiferi");
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		System.out.println("================\n=====DELFINO====");
		Animale delf = new Delfino("fischio", "pesci, calamari e crostacei");
		delf.dormi();
		delf.verso();
		delf.mangia();
		
		
	}

}

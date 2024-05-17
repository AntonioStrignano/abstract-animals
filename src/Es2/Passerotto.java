package Es2;

public class Passerotto extends Animale implements Volatile{

	public Passerotto() {
		verso = "cinguettio";
		dieta = "fiocchi d'avena, noci e nocciole, uvette e frutta";
	}
	@Override
	public void verso() {
		System.out.println("Il mio verso è: " + this.getVerso() + ". Cip cip!" );
	}
	@Override
	public void vola() 
	{System.out.println("Sto volando!!!");}
}

package Es2;

public class Passerotto extends Animale{

	public Passerotto(String verso, String dieta) {
		super(verso, dieta);
	}
	@Override
	public void verso() {
		System.out.println("Il mio verso è: " + this.getVerso() + ". Cip cip!" );
	}
	@Override
	public void vola() 
	{System.out.println("Sto volando!!!");}
}

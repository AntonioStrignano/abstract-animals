package Es1;

public class Cane extends Animale{

	public Cane(String verso, String dieta) {
		super(verso, dieta);
	}
	
	@Override
	public void verso() {
		System.out.println("Il mio verso è: " + this.getVerso() + ". Bau bau!" );
	}
}

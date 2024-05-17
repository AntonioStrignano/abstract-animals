package Es1;

public class Aquila extends Animale{

	public Aquila(String verso, String dieta) {
		super(verso, dieta);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void verso() {
		System.out.println("Il mio verso è: " + this.getVerso() + ". Kuweee!" );
	}
}

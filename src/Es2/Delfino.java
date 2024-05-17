package Es2;

public class Delfino extends Animale implements Nuotante{

	public Delfino(String verso, String dieta) {
		super(verso, dieta);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void verso() {
		System.out.println("Il mio verso è: " + this.getVerso() + ". Ihihihih!" );
	}
	@Override
	public void nuota() {System.out.println("Sto nuotando!!!");}
}
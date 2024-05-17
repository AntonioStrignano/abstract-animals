package Es2;

public class Aquila extends Animale implements Volatile{

	public Aquila() {
		verso = "strido";
		dieta = "piccoli e medi mammiferi";
	}
	@Override
	public void verso() {
		System.out.println("Il mio verso è: " + this.getVerso() + ". Kuweee!" );
	}
	@Override
	public void vola() 
	{System.out.println("Sto volando!!!");}
}

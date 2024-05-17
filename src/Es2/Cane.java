package Es2;

public class Cane extends Animale{

	public Cane() {
		this.verso = "abbaio";
		this.dieta = "onnivora";
	}
	
	@Override
	public void verso() {
		System.out.println("Il mio verso è: " + this.getVerso() + ". Bau bau!" );
	}
}



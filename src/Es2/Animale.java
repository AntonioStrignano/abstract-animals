/* realizzare un programma che rappresenti il regno animale. creiamo una classe astratta Animale e delle classi che estendono: Cane, Passerotto, Aquila, Delfino.
 * Vogliamo che gli animali abbiano i seguenti metodi:
 * - void dormi() (mostra a video "Zzz")
 * - void verso() (mostra a video il verso fatto dall'animale specifico)
 * - void mangia()(mostra a video quello che mangia. erba, carne, ...?)
 * 
 * Quali di questi metodi devono essere implementati nella classe astratta e quali devono essere lasciati astratti e implementati dalle classei che la estendono?
 * Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati
 * 
 */

package Es2;

public abstract class Animale implements Interface {
	private String verso;
	private String dieta;
	
	public Animale(String verso, String dieta) {
		this.verso = verso;
		this.dieta = dieta;
	}
//			METODI
	@Override
	public void dormi() {
		System.out.println("Zzz");
	}
	@Override
	public void mangia() {
		System.out.println("La mia dieta è: " + dieta);
	}
	public void vola() {}
	public void nuota() {}
	

//			GETTER E SETTER
	public String getVerso() {
		return verso;
	}
	public void setVerso(String verso) {
		this.verso = verso;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
//			/ GETTER E SETTER

}

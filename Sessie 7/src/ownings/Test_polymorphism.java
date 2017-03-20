package ownings;

import org.junit.Test;

public class Test_polymorphism {
	
	@Test
	public void test(){
		Painting painting = new Painting();
		Ownable paintingAsOwnable = painting; // Painting gaat nu opgeslagen worden als ownable (Polymorfisme)
		// paintingAsOwnable.getPainter(); gaat niet omdat statisch type Ownable is ookal heeft het object de eig van een Painting
		// ownable is superklasse dus heeft geen methodes van Painting (omgekeerd wel)
		
		// Painting painting2 = paintingAsOwnable; gaat niet lukken omdat Ownable algemener is dan Painting
		// wat wel gaat:
		Painting painting2 = (Painting)paintingAsOwnable; // 'just trust me java', een class cast
		
		Dog dog = new Dog();
		paintingAsOwnable = dog;
		
		Painting painting3 = (Painting)paintingAsOwnable; // gaat niet werken want de types zijn niet compatibel
														  // dog gaat eigenschappen hebben die painting niet heeft en vice versa
	}
	
}

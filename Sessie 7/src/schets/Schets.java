package schets;

import java.util.HashSet;
import java.util.Set;

class Person extends java.lang.Object{ // java als geen extends gegeven w extend 
									   // deze automatisch de klasse Object.
	Set<Ownable> ownables = new HashSet<>();
	
	int getTotalValue(){
		int totalAmount = 0;
		for(Ownable ownable: ownables)
			totalAmount += ownable.getValue();
		return totalAmount;
	}
	
	static void test(){
		Person person = new Person();
		Dog dog = new Dog();
		Object object1 = person;
		Object object2 = dog;
		
		Set<Object> objects = new HashSet<>();
		objects.add(object1);
		objects.add(object2);
		
		// doordat object van type object is kunnen deze objecten allemaal in de set Objects gestoken worden.
		
		
	}
}

abstract class Ownable{ // door abstract kunnen er geen rechtstreekse objecten van de klasse ownable
						// aangemaakt worden.
	protected Ownable(int value){ // protected zodat enkel in dezelfde package accessable is
								  // en zodat enkel extensies aan de constructor geraakt.
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	private int value;
}

class Painting extends Ownable{
	
	Painting(int value){
		// this.value = value gaat hier niet omdat value private is in Ownable
		// dus we zullen de constructor van ownable moeten oproepen
		// alle privates van een superklasse zijn niet accessable in de subklasse
		
		super(value);
	}
	
}

class Dog extends Ownable{
	Dog(){
		super(0);
	}
	
}

// java kan enkel van een superklasse overerven. meervoudige overerving is niet beschikbaar in java 
// voor klassen (er zijn dus uitzonderingen).
// de oppersuperduperklasse is Object, deze heeft geen superklasse

// gebruik zoveel mogelijk de public methodes van de superklasse, hou de attributen dus private in de superklasse!
// ga niet rechtstreeks de attributen aanpassen van de superklasse: gebruik de getters en setters
// dit bevordert de modulariteit van de code/klasse

// statisch type en dynamisch type
// java is getypeerde taal: de gedeclareerde types zijn de statische type. Het statische type staat VAST
// het dynamische type kan wijzigen tijdens de uitvoering vh programma
// bvb een int kan gecast worden naar een LONG integer, de int waarde wordt omgezet naar Long waarde. 
// bij Polymorfisme gaat het object niet wijzigen enkel het dynamische type.



package poo.aulas.polimorfismo;

public class Cachorro extends Animal{ //é um animal
	// anotacao que indica para o compilador que é uma sobrescrita
	@Override 
	public void fazerBarulho() {
		System.out.println("Au au");
	}
}

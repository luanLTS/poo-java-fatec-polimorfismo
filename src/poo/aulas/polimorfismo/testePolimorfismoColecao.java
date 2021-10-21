package poo.aulas.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class testePolimorfismoColecao {

	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<>();
		animais.add(new Gato());
		animais.add(new Cachorro());
		animais.add(new Cachorro());
		animais.add(new Gato());
		animais.add(new BemTeVi());
		
		for (Animal animal: animais) {
			//chamando o metodo fazer barulho sobre o objeto
			animal.fazerBarulho();
		}
	}

}

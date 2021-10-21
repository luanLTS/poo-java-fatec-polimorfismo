package poo.aulas.polimorfismo.exercicios;

import java.util.ArrayList;
import java.util.List;

public class testeFiguraPolimorfismo {

	public static void main(String[] args) {
		List<Figura> figuras = new ArrayList<>();
		figuras.add(new Quadrado(5, 5));
		figuras.add(new Retangulo(5, 10));
		figuras.add(new Triangulo(5, 15));
		figuras.add(new Quadrado(10, 10));
		figuras.add(new Retangulo(7, 12));
		
		for ( Figura figura : figuras  ) {
			figura.calculoarea();
		}
	}

}

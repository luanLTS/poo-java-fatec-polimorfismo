package poo.aulas.polimorfismo.exercicios;

import java.util.ArrayList;
import java.util.List;

public class TesteFigutas {

	public static void main(String[] args) {
		List<FiguraManual> figuras = new ArrayList<>();
		figuras.add(new FiguraManual(1, 10, 10));
		figuras.add(new FiguraManual(2, 10, 5));
		figuras.add(new FiguraManual(3, 15, 8));
		figuras.add(new FiguraManual(2, 5, 12));
		figuras.add(new FiguraManual(1, 5, 5));
		
		
		for ( FiguraManual figura : figuras  ) {
			figura.area();
		}
	}
	
}

class FiguraManual {
	// 1 - quadrado, 2 - retangulo e 3 - triangulo retangulo
	int tipo;
	double altura;
	double base;
	public FiguraManual (int tipo, double altura, double base) {
		this.tipo = tipo;
		this.altura = altura;
		this.base = base;
	}
	
	public void area() {
		if ( tipo == 1  ) { // quadrado
			System.out.println("quadrado");
			System.out.println("Area = " + ( altura * base ));
		} else if ( tipo == 2  ) { // retangulo
			System.out.println("retangulo");
			System.out.println("Area = " + ( altura * base ));
		} else if ( tipo == 3  ) { // triangulo
			System.out.println("triangulo");
			System.out.println("Area = " + ( ( altura * base ) / 2 ));
		}
	}
}
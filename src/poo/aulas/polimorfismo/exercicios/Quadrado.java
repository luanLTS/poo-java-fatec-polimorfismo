package poo.aulas.polimorfismo.exercicios;

public class Quadrado extends Figura{
	double base;
	double altura;
	
	public Quadrado(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calculoarea() {
		System.out.println("Area do quadrado: " + ( this.base * this.altura ));
	}
}

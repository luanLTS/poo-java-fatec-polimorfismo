package poo.aulas.polimorfismo.exercicios;

public class Retangulo extends Figura{
	double base;
	double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calculoarea() {
		System.out.println("Area do retangulo: " + ( this.base * this.altura ));		
	}
}

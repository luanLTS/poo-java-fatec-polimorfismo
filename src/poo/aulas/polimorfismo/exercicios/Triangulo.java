package poo.aulas.polimorfismo.exercicios;

public class Triangulo extends Figura{
	double catetoOposto;
	double hipotenusa;
	
	public Triangulo(double catetoOposto, double hipotenusa) {
		this.catetoOposto = catetoOposto;
		this.hipotenusa = hipotenusa;
	}
	
	@Override
	public void calculoarea() {
		System.out.println("Area do triangulo: " + ( this.catetoOposto * this.hipotenusa ) / 2);
	}
}

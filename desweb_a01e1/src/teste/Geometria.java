package teste;

import figuras.Losango;
import figuras.Quadrado;
import figuras.Retangulo;
import figuras.Triangulo;

public class Geometria {

	public static void main(String[] args) {
		
		Losango  losango = new Losango(10.0,5.0);
		Triangulo triangulo = new Triangulo(10.0,5.0);
		Retangulo retangulo = new Retangulo(7.0,3.0);
		Quadrado quadrado = new Quadrado(6.0);
		
		System.out.println(losango.area());
		System.out.println(retangulo.area());
		System.out.println(triangulo.area());
		System.out.println(quadrado.area());
		System.out.println(retangulo.diagonal());
		System.out.println(quadrado.diagonal());
	}

}

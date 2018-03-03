package figuras;

public class Retangulo {
	
	private double ladoMaior,ladoMenor;

	public Retangulo(double base, double altura) {
		super();
		this.ladoMaior = base;
		this.ladoMenor = altura;
	}
	
	public double area() {
		return ladoMaior*ladoMenor;
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(ladoMenor, 2.0)+ Math.pow(ladoMaior,2.0));
	}

	public double getBase() {
		return ladoMaior;
	}

	public void setBase(double base) {
		this.ladoMaior = base;
	}

	public double getAltura() {
		return ladoMenor;
	}

	public void setAltura(double altura) {
		this.ladoMenor = altura;
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + ladoMaior + ", altura=" + ladoMenor + "]";
	}
	
}

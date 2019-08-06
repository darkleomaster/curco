package entidades;

public class Retangulo {
		
	public double altura;
	public double largura; 
	double result;


	public double area() {
		
		result = altura * largura;
		return result;
	}
	
	public double perimetro() {
		
		result = (altura*2)+(largura*2);
		return result;
	}
	
	public double diagonal(){
		
		result = Math.sqrt((altura*altura)+(largura*largura));
		return result;
	}

}

public class Main {

	public static void main(String[] args) {
		//Exemplo 1.
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		//Exemplo 2.
		int z;
		double w;
		
		z = 5;
		w = 2 * z;
		
		System.out.println("-----");
		System.out.println(z);
		System.out.println(w);
		
		//Exemplo 3.
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("-----");
		System.out.println(area);
		
		//Exemplo 4.
		int c, d;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = (double) c/d;
		
		System.out.println("-----");
		System.out.println(resultado);
		//Obs: O resultado será 2.0, pois as variáveis são do tipo inteiro. Assim o compilador trunca as casas decimais.
		//Para retornar isso será necessário fazer o casting que é a conversão explicita dos valores, inserindo (double) ou (int). 
	}

}

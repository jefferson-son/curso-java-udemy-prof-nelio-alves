import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Configuração de localidade.
		Locale.setDefault(Locale.US);
		
		//Sem quebra de linha.
		System.out.print("Olá Mundo,");
		//Com quebra de linha.
		System.out.println("Bom dia!");
		
		//Escrevendo o conteúdo de uma variável inteira.
		int y = 32;
		System.out.println(y);
		
		//Escrevendo o conteúdo de uma variável com ponto flutuante.
		double x = 10.35784;
		System.out.println(x);
		
		//Escrevendo o conteúdo de uma variável de ponto flutuante com duas casas decimais.
		//OBS: %n ou \n insere uma quebra de linha.
		double z = 10.35784;
		System.out.printf("%.2f%n",z);
		
		//Concatenando vários elementos em um mesmo comando de escrita.
		System.out.println("RESULTADO = " + x + " METROS");
		
		//Concatenando vários elementos em um mesmo comando de escrita com formatação do printf.
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		//Concatenando vários elementos em um mesmo comando de escrita com tipos diferentes de variáveis.
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texo
		//%n = quebra de linha
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.", nome, idade, renda);

	}

}

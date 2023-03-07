package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Path getName: " + path.getName());
		System.out.println("Path getParent: " + path.getParent());
		System.out.println("Path getAbsolutePath: " + path.getAbsolutePath());
		System.out.println("Path getFreeSpace: " + path.getFreeSpace());
		System.out.println("Path getAbsoluteFile: " + path.getAbsoluteFile());
		System.out.println("Path getClass: " + path.getClass());
		System.out.println("Path getParentFile: " + path.getParentFile());
		
		
		
		sc.close();

	}

}

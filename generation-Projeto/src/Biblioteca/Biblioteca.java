package Biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;
import Livros.Ficcao;
import Livros.Infantil;
import Livros.Quadrinhos;
import Livros.Romance;
import Livros.Terror;

public class Biblioteca {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		Romance R = new Romance();
		Ficcao F = new Ficcao();
		Terror T = new Terror();
		Quadrinhos Q = new Quadrinhos();
		Infantil I = new Infantil();
		
		int op = 0;
		
		System.out.println("*************************************************");
		System.out.println("*                  BIBLIOTECA                   *");
		System.out.println("*************************************************");
		System.out.println("*               Estante Literária               *");
		System.out.println("*                                               *");
		System.out.println("*                 1 - Romance:                  *");
		System.out.println("*                 2 - Ficção:                   *");
		System.out.println("*                 3 - Terror:                   *");
		System.out.println("*                 4 - Infantil:                 *");
		System.out.println("*                 5 - Quadrinhos:               *");
		System.out.println("*                 6 - Sair.                     *");
		System.out.println("*                                               *");
		System.out.println("*************************************************");
		
		
		while (true) {
			try {
			System.out.println("*  Escolha o genero literario:                  *");
			
			
			op = ler.nextInt();
			
			}catch(InputMismatchException erro) {
				System.out.println("Digite apenas numeros inteiros.");
				ler.nextLine();
			}
			
			switch (op) {
			case 1:
				System.out.println("Romance: \n");
				R.visualizar();
				R.titulo();
				R.autor();
				R.idioma();
				
				break;
				
			case 2:
				System.out.println("Ficção: \n");
				F.visualizar();
				F.titulo();
				F.autor();
				F.idioma();
				
				break;
				
			case 3:
				System.out.println("Terror: \n");
				T.visualizar();
				T.titulo();
				T.autor();
				T.idioma();
				
				break;
				
			case 4:
				System.out.println("Infantil: \n");
				I.visualizar();
				I.titulo();
				I.autor();
				I.idioma();
				
				break;
				
			case 5:
				System.out.println("Quadrinhos: \n");
				Q.visualizar();
				Q.titulo();
				Q.autor();
				Q.idioma();
				
				break;
				
			case 6:
				System.out.println("\nLembre-se, A leitura engrandece a alma!");
				ler.close();
				System.exit(0);
				
				break;
				
			default:
				System.out.println("\nOpção Invalida!");
				
			}
		}

	}

}

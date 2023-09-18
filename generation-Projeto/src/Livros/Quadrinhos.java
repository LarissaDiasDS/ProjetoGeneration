package Livros;

public class Quadrinhos extends EstanteLivros {

	private String titulo;
	private String autor ;
	private String idioma ;
	
	
	@Override
	 public void titulo() {
		titulo = "Batmam";
		System.out.println("Titulo do livro: " + titulo);
	}
	
	@Override
	 public void autor() {
		autor = "Bob Kane";
		System.out.println("Autor(a) do Livro: " + autor);
	}
	@Override
	 public void idioma() {
		 idioma = "Ingles Americano";
		 System.out.println("Idioma do livro: " + idioma);
	}	
		
	@Override
     public void visualizar() {
    	 super.visualizar();
     
     }
}

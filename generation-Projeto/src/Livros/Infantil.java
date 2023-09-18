package Livros;

public class Infantil extends EstanteLivros{

	private String titulo;
	private String autor ;
	private String idioma ;
	
	
	@Override
	 public void titulo() {
		titulo = "Turma da Monica";
		System.out.println("Titulo do livro: " + titulo);
	}
	
	@Override
	 public void autor() {
		autor = "Mauricio de Souza";
		System.out.println("Autor(a) do Livro: " + autor);
	}
	@Override
	 public void idioma() {
		 idioma = "Portugues BR";
		 System.out.println("Idioma do livro: " + idioma);
	}	
		
	@Override
     public void visualizar() {
    	 super.visualizar();
     
     }
}

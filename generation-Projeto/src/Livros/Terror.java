package Livros;

public class Terror extends EstanteLivros{

	private String titulo;
	private String autor ;
	private String idioma ;
	
	
	@Override
	 public void titulo() {
		titulo = "Os Passaros";
		System.out.println("Titulo do livro: " + titulo);
	}
	
	@Override
	 public void autor() {
		autor = "Frank Baker";
		System.out.println("Autor(a) do Livro: " + autor);
	}
	@Override
	 public void idioma() {
		 idioma = "Ingles";
		 System.out.println("Idioma do livro: " + idioma);
	}	
		
	@Override
     public void visualizar() {
    	 super.visualizar();
     
     }
}

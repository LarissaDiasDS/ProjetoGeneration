package Livros;

public class Romance extends EstanteLivros{
	
	private String titulo;
	private String autor ;
	private String idioma ;
	
	
	@Override
	 public void titulo() {
		titulo = "Perdida";
		System.out.println("Titulo do livro: " + titulo);
	}
	
	@Override
	 public void autor() {
		autor = "Carina Rissi";
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

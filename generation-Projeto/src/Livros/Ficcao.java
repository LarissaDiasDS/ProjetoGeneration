package Livros;

public class Ficcao extends EstanteLivros{
  
	private String titulo;
	private String autor ;
	private String idioma ;
	
	
	@Override
	 public void titulo() {
		titulo = "Harry Potter";
		System.out.println("Titulo do livro: " + titulo);
	}
	
	@Override
	 public void autor() {
		autor = "Joanne Jo Rowling";
		System.out.println("Autor(a) do Livro: " + autor);
	}
	@Override
	 public void idioma() {
		 idioma = "Ingles Britanico";
		 System.out.println("Idioma do livro: " + idioma);
	}	
		
	@Override
     public void visualizar() {
    	 super.visualizar();
     
     }
}

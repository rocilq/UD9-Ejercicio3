package main;

import clases.Libro;

public class LibroApp {
	
	public static void main(String[] args) {
		Libro libro1 = new Libro("ABC", "Libro1", "Autor1", 122);
		Libro libro2 = new Libro("ABC", "Libro2", "Autor2", 146);
		
		libro1.toString();
		libro2.toString();
		
	}
	
	String conteoPaginas(Libro libro1, Libro libro2) {
		
		String libroMayor = "";
		
		if (libro1.getnPaginas() > libro2.getnPaginas()) {
			libroMayor = libro1.getTitulo() + " tiene más páginas.";
		}
		
		else if (libro1.getnPaginas () < libro2.getnPaginas()) {
			libroMayor = libro2.getTitulo() + " tiene más páginas.";
		}
		
		return libroMayor;
		
	}

}


public class Ejercicio3App {

	public static void main(String[] args) {
		Libro libro1 = new Libro("IRHFYA475769","Orgullo y Prejuicio","Jane Austen",360);
		
		Libro libro2 = new Libro("THYJUO197532","El codigo Da Vinci","Dan Brown",656);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		System.out.println("El libro con mas páginas es: " + masPaginas(libro1,libro2));

	}
	
	public static String masPaginas(Libro libro1, Libro libro2) {
		
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			return libro1.getTitulo();
		}else {
			return libro2.getTitulo();
		}

	}

}

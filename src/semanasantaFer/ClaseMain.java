package semanasantaFer;

import java.util.List;



	/**
	 * Esta clase representa el punto de entrada principal del programa.
	 * Se utilizan las clases Libro y Biblioteca para gestionar libros.
	 * 
	 * @author Fernando Acosta
	 * @version 1.0
	 * @since 2024-03-31
	 */
	public class ClaseMain {
	    public static void main(String[] args) {
	        // Crear algunos libros
	        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry");
	        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
	        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez");
	        //Nuevo libroagregado
	        Libro libro4 = new Libro("Padre Rico Padre Pobre","Robert T. Kiyosaki");

	        // Agregar los libros a la biblioteca
	        Biblioteca biblioteca = new Biblioteca();
	        biblioteca.agregarLibro(libro1);
	        biblioteca.agregarLibro(libro2);
	        biblioteca.agregarLibro(libro3);
	        biblioteca.agregarLibro(libro4);

	        // Buscar libros por título
	        System.out.println("Buscando libros por título:");
	        List<Libro> librosPorTitulo = biblioteca.buscarPorTitulo("el principito");
	        imprimirLibros(librosPorTitulo);

	        // Buscar libros por autor
	        System.out.println("\nBuscando libros por autor:");
	        List<Libro> librosPorAutor = biblioteca.buscarPorAutor("Gabriel García Márquez");
	        imprimirLibros(librosPorAutor);
	    }

	    /**
	     * Imprime la lista de libros.
	     * 
	     * @param libros La lista de libros a imprimir.
	     */
	    private static void imprimirLibros(List<Libro> libros) {
	        if (libros.isEmpty()) {
	            System.out.println("No se encontraron libros.");
	        } else {
	            for (Libro libro : libros) {
	                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
	            }
	        }
	    }
	    }

	

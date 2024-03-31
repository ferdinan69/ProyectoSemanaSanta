package semanasantaFer;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una biblioteca que contiene libros.
 * 
 * @author Fernando Acosta
 * @version 1.0
 * @since 2024-03-31
 */
public class Biblioteca {
    private List<Libro> libros;

    /**
     * Constructor para crear una nueva biblioteca sin libros.
     */
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    /**
     * Método para agregar un libro a la biblioteca.
     * 
     * @param libro El libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Método para buscar libros por título.
     * 
     * @param titulo El título del libro a buscar.
     * @return Una lista de libros que coinciden con el título especificado.
     */
    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    /**
     * Método para buscar libros por autor.
     * 
     * @param autor El autor del libro a buscar.
     * @return Una lista de libros escritos por el autor especificado.
     */
    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }
}
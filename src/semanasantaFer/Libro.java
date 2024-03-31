package semanasantaFer;


/**
 * Esta clase representa un libro.
 * 
 * @author Fernando Acosta
 * @version 1.0
 * @since 2024-03-31
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    /**
     * Constructor para crear un nuevo libro.
     * 
     * @param titulo El título del libro.
     * @param autor  El autor del libro.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    /**
     * Método para obtener el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método para obtener el autor del libro.
     * 
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método para verificar si el libro está prestado.
     * 
     * @return true si el libro está prestado, false en caso contrario.
     */
    public boolean estaPrestado() {
        return prestado;
    }

    /**
     * Método para prestar el libro.
     */
    public void prestar() {
        prestado = true;
    }

    /**
     * Método para devolver el libro.
     */
    public void devolver() {
        prestado = false;
    }
}
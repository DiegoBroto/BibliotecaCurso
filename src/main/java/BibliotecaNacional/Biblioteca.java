package BibliotecaNacional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();

    }

    public void addBooks(Libro libro) {
        if (!this.libros.contains(libro))
            this.libros.add(libro);
        else
            System.out.println("No se inserta el libro porque ya esta anteriormente agregado");
    }

    public List<Libro> getBooks() {
        return new ArrayList<>(libros);
    }

    public List<Libro> getBooksIsbn(Integer isbn) {
        List<Libro> booksIsbn = new ArrayList<>();
        this.libros.forEach(libro -> {
            if (libro.getIsbn().equals(isbn)) {
                booksIsbn.add(libro);
                System.out.println("libro.getIsbn() = " + libro.getIsbn());
                System.out.println("libro = " + libro);
            }
        });
        return booksIsbn;
    }
}
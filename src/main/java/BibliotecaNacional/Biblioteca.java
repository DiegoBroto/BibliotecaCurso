package BibliotecaNacional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;
    private String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.socios = new ArrayList<>();

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

    public List<Libro> getBooksCat(String categoria) {
        List<Libro> bookCat = new ArrayList<>();
        this.libros.forEach(libro -> {
            if (libro.getCategoria().equals(categoria)) {
                bookCat.add(libro);
                System.out.println("libro x cat = " + libro.getCategoria());
                System.out.println("libro = " + libro);
            }
        });
        return bookCat;
    }

    public void addSocio(Socio estudiante) {
        if (!this.socios.contains(estudiante)) {
            this.socios.add(estudiante);

        }
    }

    public List<Socio> getSocio() {
        return new ArrayList<>(socios);
    }
}
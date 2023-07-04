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
    }

    public List<Libro> getBooks() {
        return new ArrayList<>(libros);
    }
}

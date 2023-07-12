package BibliotecaNacional;

import java.util.Objects;

public class Libro {

    private final String titulo;
    private final Integer isbn;
    private final String autor;
    private final String categoria;

    public Libro(String titulo, Integer isbn, String autor, String categoria) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.categoria = categoria;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(getIsbn(), libro.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

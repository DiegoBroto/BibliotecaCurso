import BibliotecaNacional.Biblioteca;
import BibliotecaNacional.Libro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
        //1.Incorporar libro a la Biblioteca, con codigo ISBN, no puede estar duplicado

    void addBookTest() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotter1 = new Libro("Harry Potter 1", 1002003, "J. K. Rowling", "LITERATURA");
        Libro harryPotter2 = new Libro("Harry Potter 2", 1002004, "J. K. Rowling", "LITERATURA");

        //act
        biblioteca.addBooks(harryPotter1);
        biblioteca.addBooks(harryPotter2);

        //assert
        assertEquals(2, biblioteca.getBooks().size());
    }

    @Test
    void addBookDuplicadoTestFail() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotter1 = new Libro("Harry Potter 1", 1002003, "J. K. Rowling", "LITERATURA");
        Libro harryPotter2 = new Libro("Harry Potter 2", 1002004, "J. K. Rowling", "LITERATURA");
        //act
        biblioteca.addBooks(harryPotter1);
        biblioteca.addBooks(harryPotter2);
        biblioteca.addBooks(harryPotter2);

        //assert
        assertEquals(2, biblioteca.getBooks().size());
    }

    //2.Dado un código ISBN, buscar y devolver los datos del libro identificado por dicho ISBN. Título, código ISBN, autor, y categoría.
    @Test
    void findBooksIsbnTest() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotter1 = new Libro("Harry Potter 1", 1002003, "J. K. Rowling", "LITERATURA");
        //act
        biblioteca.addBooks(harryPotter1);

        //assert
        assertEquals(1, biblioteca.getBooksIsbn(1002003).size());

    }
    @Test
    void findBooksIsbnTestFail() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotter1 = new Libro("Harry Potter 1", 1002003, "J. K. Rowling", "LITERATURA");
        //act
        biblioteca.addBooks(harryPotter1);

        //assert
        assertEquals(0, biblioteca.getBooksIsbn(1002004).size());

    }
    //3.Dado una categoría, permitir listar todos los libros correspondientes a esa categoría.
    @Test
    void FindBookCatTest() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotter1 = new Libro("Harry Potter 1", 1002003, "J. K. Rowling", "LITERATURA");
        Libro matematica = new Libro("Matematica Basica", 2002003, "Emi", "MANUAL");
        Libro harryPotter2 = new Libro("Harry Potter 2", 1002004, "J. K. Rowling", "LITERATURA");
        //act
        biblioteca.addBooks(harryPotter1);
        biblioteca.addBooks(harryPotter2);
        biblioteca.addBooks(matematica);

        //assert
        assertEquals(2,biblioteca.getBooksCat("LITERATURA").size());
        assertEquals(1,biblioteca.getBooksCat("MANUAL").size());
    }
    @Test
    void FindBookCatTestFail() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotter1 = new Libro("Harry Potter 1", 1002003, "J. K. Rowling", "LITERATURA");
        Libro matematica = new Libro("Matematica Basica", 2002003, "Emi", "MANUAL");
        Libro harryPotter2 = new Libro("Harry Potter 2", 1002004, "J. K. Rowling", "LITERATURA");
        //act
        biblioteca.addBooks(harryPotter1);
        biblioteca.addBooks(harryPotter2);
        biblioteca.addBooks(matematica);

        //assert
        assertEquals(0,biblioteca.getBooksCat("ACCION").size());
    }

}

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
        Libro harryPotter1 = new Libro("Harry Potter 1", 001002003, "J. K. Rowling", "LITERATURA");
        Libro harryPotter2 = new Libro("Harry Potter 2", 001002004, "J. K. Rowling", "LITERATURA");

        //act
        biblioteca.addBooks(harryPotter1);
        biblioteca.addBooks(harryPotter2);

        //assert
        assertEquals(2, biblioteca.getBooks().size());
    }
    @Test
        void addBookTestFail() {
            //arrange
            Biblioteca biblioteca = new Biblioteca("Nacional");
            Libro harryPotter1 = new Libro("Harry Potter 1", 001002003, "J. K. Rowling", "LITERATURA");

            //act
            biblioteca.addBooks(harryPotter1);
            biblioteca.addBooks(harryPotter1);

            //assert
            assertEquals(2, biblioteca.getBooks().size());
        }

}

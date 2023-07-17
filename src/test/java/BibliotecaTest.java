import BibliotecaNacional.Biblioteca;
import BibliotecaNacional.Libro;
import BibliotecaNacional.Socio;
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
    void findBookCatTest() {
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
        assertEquals(2, biblioteca.getBooksCat("LITERATURA").size());
        assertEquals(1, biblioteca.getBooksCat("MANUAL").size());
    }

    @Test
    void findBookCatTestFail() {
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
        assertEquals(0, biblioteca.getBooksCat("ACCION").size());
    }

    //4.Incorporar un estudiante o socio a la biblioteca registrando un tipo y número de documento, nombre y apellido, y domicilio.
    @Test
    void addSocioTest() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Socio emilianoPerez = new Socio("DNI", 34504576, "Emiliano", "Perez", "La Matanza");
        Socio diegoBroto = new Socio("DNI", 29508130, "Diego", "Broto", "Hudson");

        //act
        biblioteca.addSocio(emilianoPerez);
        biblioteca.addSocio(diegoBroto);
        //assert
        assertEquals(2, biblioteca.getSocio().size());
    }

    @Test
    void addSocioFailTest() {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Socio emilianoPerez = new Socio("DNI", 34504576, "Emiliano", "Perez", "La Matanza");
        //act
        biblioteca.addSocio(emilianoPerez);
        biblioteca.addSocio(emilianoPerez);
        //assert
        assertEquals(1, biblioteca.getSocio().size());
    }
    //5.Un estudiante solicita prestado un libro y su plazo límite de devolución es dentro de 15 días corridos, teniendo presente que exista un libro disponible.
}

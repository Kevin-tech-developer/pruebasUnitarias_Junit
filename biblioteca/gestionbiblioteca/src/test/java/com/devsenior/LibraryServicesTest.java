package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.devsenior.model.Book;
import com.devsenior.model.BookRepository;
import com.devsenior.model.Loan;
import com.devsenior.model.LoanRepository;
import com.devsenior.model.User;

public class LibraryServicesTest {
    
    @Mock
    private BookRepository bookRepository;
    @Mock
    private LoanRepository loanRepository;
    @InjectMocks
    private LibraryServices libraryServices;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddBook(){
        var book = new Book(1, "carne de astronauta", "Suescun");

        libraryServices.addBook(book);

        verify(bookRepository).save(book);
    }

    @Test
    void testGetBook(){
        var book = new Book(2, "carne de astronauta", "suescun");

        when(bookRepository.findById(2)).thenReturn(book);

        var book2 = libraryServices.getBook(2);

        assertEquals("carne de astrinauta", book2.getTitulo());
        assertEquals("suescun", book2.getAutor());
    }

    @Test
    void testGetLoanByUser(){
        User user = new User(2, "kevin");
        Book book1 = new Book(1, "carne de astronauta", "suescun");
        Book book2 = new Book(1, "carne de astronauta 2", "suescun");
        Loan loan1 = new Loan(1, user, book1, LocalDate.of(2024, 1, 2));
        Loan loan2 = new Loan(2, user, book2, LocalDate.of(2024, 2, 2));

        List<Loan> loans = Arrays.asList(loan1, loan2);
        when(loanRepository.FindByUser(user)).thenReturn(loans);
        List<Loan> result = libraryServices.getLoanByUser(user);

        assertEquals(2, result.size());
        assertEquals(loan1, result.get(0));
        assertEquals(loan2, result.get(1));
    }

    @Test
    void testLoanBook(){
        //se crean los objetos para la prueba
        User user = new User(1, "kevin");
        Book book = new Book(1, "carne de astronauta", "suescun");
        //se llama al metodo de realizar el prestamo con los objetos creados
        libraryServices.loanBook(user, book);

        //se verifica que llama al metodo save
        //argThat permite verificar que el prestamo guardado tiene los datos correctos, osea si el prestamo se realizo a usuario que creamos
        //con su respectivo libro, y la fecha correcta
        verify(loanRepository).save(Mockito.argThat(loan -> loan.getUser().equals(user) && loan.getBook().equals(book) &&
        loan.getDate().equals(LocalDate.now())));
    }
}

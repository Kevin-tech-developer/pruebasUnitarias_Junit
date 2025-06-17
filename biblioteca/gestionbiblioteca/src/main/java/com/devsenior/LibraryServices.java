package com.devsenior;

import java.time.LocalDate;
import java.util.List;

import com.devsenior.model.Book;
import com.devsenior.model.BookRepository;
import com.devsenior.model.Loan;
import com.devsenior.model.LoanRepository;
import com.devsenior.model.User;

public class LibraryServices {
    
    private BookRepository bookRepository;
    private LoanRepository loanRepository;

    public LibraryServices(BookRepository bookRepository, LoanRepository loanRepository) {
        this.bookRepository = bookRepository;
        this.loanRepository = loanRepository;
    }

    public Book getBook(int id){
        return bookRepository.findById(id);
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void loanBook( User user, Book book){
        Loan loan = new Loan(user.getId(), user, book, LocalDate.now());
        loanRepository.save(loan);
    }

    public List<Loan> getLoanByUser(User user){
        return loanRepository.FindByUser(user);
    }
    
    
}

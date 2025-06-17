package com.devsenior.model;

import java.util.List;

public interface LoanRepository {

    void save(Loan loan);

    Loan FindById(int id);

    List<Loan> FindByUser(User user);
}

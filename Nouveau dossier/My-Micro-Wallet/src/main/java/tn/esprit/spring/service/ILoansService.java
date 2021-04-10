package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.dao.entity.Displayer;
import tn.esprit.spring.dao.entity.Loans;

public interface ILoansService {
	List<Loans> retrieveAllLoans();
	Loans addLoans(Loans u);
	void deleteLoans(String id);
	Loans updateLoans(Loans u);
	Loans retrieveLoans(String id);
}

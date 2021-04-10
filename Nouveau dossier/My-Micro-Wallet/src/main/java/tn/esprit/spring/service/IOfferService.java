package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.entity.Offer;

public interface IOfferService {
	List<Offer> retrieveAllOffers();
	Offer addOffer(Offer u);
	void deleteOffer(String id);
	Offer updateOffer(Loans u);
	Offer retrieveOffer(String id);
}

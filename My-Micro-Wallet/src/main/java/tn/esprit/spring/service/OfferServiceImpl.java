package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.entity.Offer;
import tn.esprit.spring.dao.repository.OfferRepository;

@Service
public class OfferServiceImpl implements IOfferService{

	@Autowired
	OfferRepository OfferRepo;
	
	@Override
	public List<Offer> retrieveAllOffers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offer addOffer(Offer u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOffer(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Offer updateOffer(Loans u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offer retrieveOffer(String id) {
		// TODO Auto-generated method stub
		return null;
	};
}

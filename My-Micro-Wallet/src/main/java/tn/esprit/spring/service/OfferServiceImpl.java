package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
		return (List<Offer>) OfferRepo.findAll();
	}

	@Override
	public Offer addOffer(Offer u) {
		// TODO Auto-generated method stub
		OfferRepo.save(u);
		return u;
	}

	@Override
	public void deleteOffer(String id) {
		// TODO Auto-generated method stub
		int OfferId=Integer.parseInt(id);
		OfferRepo.deleteById(OfferId);
		
	}

	@Override
	public Offer updateOffer(Offer u) {
		// TODO Auto-generated method stub
		OfferRepo.save(u);
		return u;
	}

	@Override
	public Optional<Offer> retrieveOffer(String id) {
		// TODO Auto-generated method stub
		int OfferId=Integer.parseInt(id);
		return OfferRepo.findById(OfferId);
	};
}

package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.dao.entity.Claims;
import tn.esprit.spring.dao.repository.ClaimsRepository;

@Service
public class ClaimsServiceImpl implements IClaimsService{
@Autowired 
ClaimsRepository ClaimsRepo;

@Override
public List<Claims> retrieveAllClaims() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Claims addClaim(Claims u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteClaims(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public Claims updateClaim(Claims u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Claims retrieveClaim(String id) {
	// TODO Auto-generated method stub
	return null;
}

}

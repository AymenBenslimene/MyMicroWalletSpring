package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
	return (List<Claims>) ClaimsRepo.findAll();
}

@Override
public Claims addClaim(Claims u) {
	// TODO Auto-generated method stub
	ClaimsRepo.save(u);
	return u;
}

@Override
public void deleteClaims(String id) {
	// TODO Auto-generated method stub
	int AgentId = Integer.parseInt(id);
	ClaimsRepo.deleteById(AgentId);
	
}

@Override
public Claims updateClaim(Claims u) {
	// TODO Auto-generated method stub
	ClaimsRepo.save(u);
	
	return u;
}

@Override
public Optional<Claims> retrieveClaim(String id) {
	// TODO Auto-generated method stub
	int AgentId = Integer.parseInt(id);
	return ClaimsRepo.findById( AgentId );
}

}

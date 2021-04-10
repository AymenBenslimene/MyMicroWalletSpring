package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.dao.entity.Claims;

public interface IClaimsService {
	List<Claims> retrieveAllClaims();
	 Claims addClaim(Claims u);
	void deleteClaims(String id);
	Claims updateClaim(Claims u);
	Optional<Claims> retrieveClaim(String id);
}

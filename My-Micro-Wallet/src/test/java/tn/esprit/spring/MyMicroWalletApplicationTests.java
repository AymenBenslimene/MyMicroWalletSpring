package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.service.LoansServiceImpl;

@SpringBootTest
class MyMicroWalletApplicationTests {
	@Autowired
	LoansServiceImpl loans;
	@Test
	void contextLoads() {
		Loans u = null;

	}

}

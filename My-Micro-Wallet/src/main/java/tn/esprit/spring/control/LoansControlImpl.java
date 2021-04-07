package tn.esprit.spring.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.service.LoansServiceImpl;

@RestController
public class LoansControlImpl {
	@Autowired
	LoansServiceImpl Loans_Service;
	
	@RequestMapping("/Loanspage")
	public String welcome(Map<String, Object> model, @RequestParam("myLoan") String
	name) {
	model.put("receivedName", name);
	return "Myloan";
	}
	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String users(User user, Model model) {
	model.addAttribute("user", new User());
	model.addAttribute("users", userService.retrieveAllUsers());
	return "users";
	}*/
	

    @GetMapping("/Loans")
    public List<Loans> allLoans() {

        return Loans_Service.retrieveAllLoans();
    }

    /*GetMapping("/users/count")
    public Long count() {

        return userService.count();
    }*/

   /* @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id) {

        Long userId = Long.parseLong(id);
        userService.deleteById(userId);
    }*/
}

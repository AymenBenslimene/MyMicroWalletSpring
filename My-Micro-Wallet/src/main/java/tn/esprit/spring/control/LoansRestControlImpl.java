package tn.esprit.spring.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.dao.entity.Account;
import tn.esprit.spring.dao.entity.Contract;
import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.dao.entity.Loans.Ultimate_Decision;
import tn.esprit.spring.dao.entity.Payment;
import tn.esprit.spring.service.AccountServiceImpl;
import tn.esprit.spring.service.ContractServiceImpl;
import tn.esprit.spring.service.LoansServiceImpl;
import tn.esprit.spring.service.PaymentServiceImpl;

@RestController
public class LoansRestControlImpl {
	@Autowired
	LoansServiceImpl Loans_Service;
	@Autowired
	AccountServiceImpl Account_Service;
	@Autowired
	ContractServiceImpl Contract_Service;
	@Autowired
	PaymentServiceImpl Payment_Service;
	
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
	

    @GetMapping("/getLoans")
    @ResponseBody
    public List<Loans> allLoans() {
    	
    	List<Loans> list = Loans_Service.retrieveAllLoans();

        return list;
    }
    
    @GetMapping("/Loansrequests")
    @ResponseBody
    public List<Loans> getLoansRequests() {
    	Ultimate_Decision ud =Ultimate_Decision.In_Treatment;
    	List<Loans> list = Loans_Service.retrieveLoansByUltimateDecision(ud);
    	
    	
        return list;
    }
    
    
    
   /* //As a client
    @GetMapping("/Loansrequests")
    @ResponseBody
    public List<Loans> getmyloans(string id){
    	Client_Service
    	client_service myLoans
    	 
    }*/
    
    
    
    @PostMapping("/LoanApprouve/{id}")
    @ResponseBody
    public Loans ApprouveLoansRequestsbyId(@PathVariable String id ) {
    	Ultimate_Decision ud =Ultimate_Decision.In_Treatment;
    	Loans u =Loans_Service.retrieveLoanById(id);
    	u.Set_Ultimate_Decision(Ultimate_Decision.Accepted);
    	Loans_Service.updateLoans(u);
    	
    	/// set Contract
/// return contract to confirm
        return u;
    }
    @PostMapping("/LoanRefuse/{id}")
    
    public Loans RefuseLoansRequestsbyId(@PathVariable String id ) {
    	Ultimate_Decision ud =Ultimate_Decision.In_Treatment;
    	Loans u =Loans_Service.retrieveLoanById(id);
    	u.Set_Ultimate_Decision(Ultimate_Decision.Refused);
    	Loans_Service.updateLoans(u);

        return u;
    }
    /*
    @PostMapping Loans PaymyLoanAutomatic(@PathVariable String id ){
    	
    	//double Amount= givemepaymentamount();
    	double Amount=60;
    	//Payment_Service.addPayment(0)
    	 	
        		//testin if payment_left = 0 
    			//change payment status 
    			//your payment is done 
    			//test if balance is on negative  
    			//test 
    	
    	//send Notification to account 
		
    	
    	return null;
    	
    }
    
    @PostMapping Loans PaymyLoansManually(PathVariable String){
		return null;
    	
    }
    

    
    @GetMapping("/Loans/count")
    public Long count() {

        return Loans_Service.countLoans();
    }*/

   /* @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id) {

        Long userId = Long.parseLong(id);
        userService.deleteById(userId);
    }*/
    
    //@PostMapping("/Loans/add/{Id}")
    @RequestMapping(value="/loan-demand",method=RequestMethod.POST)
   //@ResponseBody
    //public Loans SetLoan(@RequestBody int id ){
    //public Loans SetLoan(@PathVariable("Id") int id) {
    //@ResponseBody
    @ResponseBody
    public String DemandLoan(@RequestBody Loans u){
		//Loans u = new Loans();
		//u.Set_Loan_Id(100);
		//u.Set_Loan_Amount(10);
    	u.Set_Loan_Purchase(1200);
    	Loans_Service.addLoans(u);
		//Loans_Service.
		return  "added";
		
    	
    }
    @RequestMapping("/loanAddTesting")
    public Loans AddLoan(){
  		Loans u = new Loans();
  		u.Set_Loan_Id(101);
  		u.Set_Loan_Amount(1010);
  		Loans_Service.addLoans(u);
  		return u;}
    
    
    @DeleteMapping("/Loans/Cancel/{id}")
    public void delete(@PathVariable String id) {

        //int userId = Integer.parseInt(id);
        Loans_Service.deleteLoans(id);
    }
    
    //@RequestMapping("")

    
}

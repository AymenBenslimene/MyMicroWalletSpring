package tn.esprit.spring.control;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.dao.entity.Contract;
import tn.esprit.spring.dao.entity.Loans;
import tn.esprit.spring.service.AccountServiceImpl;
import tn.esprit.spring.service.ContractServiceImpl;
import tn.esprit.spring.service.LoansServiceImpl;
import tn.esprit.spring.service.PaymentServiceImpl;
import java.io.ByteArrayInputStream;

@RestController
public class ContractRestControlImpl {

	@Autowired
	LoansServiceImpl Loans_Service;
	@Autowired
	AccountServiceImpl Account_Service;
	@Autowired
	ContractServiceImpl Contract_Service;
	@Autowired
	PaymentServiceImpl Payment_Service;
	
	@GetMapping("/Contracts") public  List<Contract> retrieveAllContracts(){
		return Contract_Service.retrieveAllContracts();
				
	}
	
	@RequestMapping(value="/SetContractTemplate",method=RequestMethod.POST)
	//@PostMapping("")
    @ResponseBody
    public Contract SetContract(@RequestBody Contract contract) {
    	///// a lot of work here to retrieve every
		contract.setAdditional_Terms("300");
		contract.setSecurity("sec1");
    	Contract_Service.addContract(contract);
    	

        return contract;
    }
	
	@PostMapping("/NegotiateContractTemplate/{id}")
	
	public Contract NegotiateContract(@PathVariable String id,@RequestBody Contract contract){
		Contract originale= Contract_Service.retrieveContractById(id);	
		originale.setRepayment_Schedule(contract.getRepayment_Schedule());
		originale.setAdditional_Terms(contract.getAdditional_Terms());
		originale.setExtensions(contract.getExtensions());
		originale.setTime_to_maturity(contract.getTime_to_maturity());
		originale.setOriginal_Note(contract.getOriginal_Note());
		originale.setSecurity(contract.getSecurity());
		//test
		
		return originale;}
	

	@PostMapping("/FinishContract/{id}")
	public Contract FinishContract(@PathVariable String id){
		Contract c= Contract_Service.retrieveContractById(id);
		c.setSignature_Date(new Date());
		Contract_Service.addContract(c);
		return c;
		
		}
	
	/*
	@RequestMapping(value = "/pdfreport", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> ContractReport() {

        List contracts = (List<Contract>) Contract_Service.retrieveAllContracts();

        ByteArrayInputStream bis = GeneratePdfReport.citiesReport(contracts);

        var headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
	
	*/
	
	
}

package br.com.alexandre.myBilling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alexandre.myBilling.entity.Billing;
import br.com.alexandre.myBilling.repository.BillingRepository;

@Controller
public class BillingController {
	
	@Autowired
	private BillingRepository repository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/listbillings")
	@ResponseBody
	public Iterable<Billing> listaContas() {
		Iterable<Billing> billings = repository.findAll();
		return billings; 
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addbill")
	@ResponseBody
	public Billing addConta(@RequestBody Billing billing) {
		Billing bill = new Billing();
		bill.setDescription(billing.getDescription());
		bill.setValue(billing.getValue());
		bill.setPurchased(billing.getPurchased());
		repository.save(bill);
		return bill;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delbill/{id}")
	@ResponseBody
	public String deleteConta(@PathVariable("id") Long id) {
		repository.deleteById(id);
		return "Conta deletada";
	}
}

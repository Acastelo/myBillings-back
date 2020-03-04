package br.com.alexandre.myBilling.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alexandre.myBilling.entity.Billing;

public interface BillingRepository extends CrudRepository<Billing, Long>{

}

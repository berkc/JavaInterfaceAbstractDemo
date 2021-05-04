package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class AbcCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public AbcCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	public void save(Customer customer){
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid customer");
		}
	}
}

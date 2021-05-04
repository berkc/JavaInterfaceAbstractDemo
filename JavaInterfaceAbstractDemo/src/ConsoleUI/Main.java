package ConsoleUI;

import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.AbcCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new AbcCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer(1, "berk", "çolak", new GregorianCalendar(1999, 11 , 10).getTime(), "38813028430");
		
		customerManager.save(customer);
	}
		

}

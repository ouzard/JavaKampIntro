import java.rmi.RemoteException;
import Abstract.BaseCustomerManager;
import Adapters.MerniseServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
	BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniseServiceAdapter());
		
		customerManager.save(new Customer(1,"Oðuzhan","Arslan",1999,"11111111111"));
		


	}

}

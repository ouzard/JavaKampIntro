package Adapters;
import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

public class MerniseServiceAdapter implements CustomerCheckService{
	
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
	
	boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
			customer.getFirstName(),
			customer.getLastname(),
			customer.getDateOfBirth());
	 
	
	 if (result == true) {
		 
		 System.out.println("Succesfully");
			return true;
	}
	 else 
		{
			System.out.println("Unsuccesfully"); 
			return false;
		}
}
	
	

}
	


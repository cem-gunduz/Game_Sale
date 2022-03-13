package odev4gamesale.adapter;

import java.rmi.RemoteException;

import odev4gamesale.business.abstracts.CustomerCheckDao;
import odev4gamesale.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisDaoAdapter implements CustomerCheckDao{


	@Override
	public boolean checkCustomer(Customer customer) {
		KPSPublicSoap soapClient=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getIdentificationId()), customer.getName(),customer.getSurname()
					,customer.getBirthday());
			
		}catch (NumberFormatException e) {
            e.printStackTrace();
       } catch (RemoteException e) {
            e.printStackTrace();
       }
      return result;
	}

	
}

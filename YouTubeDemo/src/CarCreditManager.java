
public class CarCreditManager extends BaseCreditManager implements ICreditManager{// araba kredi yöneticisi

	
	
	@Override
	public void Calculate() {
		
		System.out.println("Araba Kredisi Hesaplandı.");
		
	}

	@Override
	public void Save() {
		
		System.out.println("Kaydedildi.");
	}
	
}

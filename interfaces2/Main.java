package interfaces2;
public class Main {

	public static void main(String[] args) {

//Class'lar sadece bir class'ý extend edebilirken istediði kadar çok interface'yi implement edebilir.
		
		CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());
		customerManager.add();
		

	}

}

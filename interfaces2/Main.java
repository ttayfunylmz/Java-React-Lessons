package interfaces2;
public class Main {

	public static void main(String[] args) {

//Class'lar sadece bir class'� extend edebilirken istedi�i kadar �ok interface'yi implement edebilir.
		
		CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());
		customerManager.add();
		

	}

}

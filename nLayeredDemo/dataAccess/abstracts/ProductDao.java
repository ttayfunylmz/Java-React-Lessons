package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	
	Product get(int id);
	
	//Artýk bunu kullanýyor olacaðýz.
	List<Product> getAll();

}

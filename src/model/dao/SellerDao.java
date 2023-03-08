package model.dao;

import java.util.List;

import model.entities.Department;

public interface SellerDao {

	void insert (SellerDao obj);
	void update (SellerDao obj);
	void deleteById (SellerDao id);
	Department findById(Integer id);
	List<SellerDao> findAll();
}

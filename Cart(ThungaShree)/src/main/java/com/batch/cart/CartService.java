package com.batch.cart;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CartService {

	@Autowired
	private CartRepository repo;
	
	public List<Cart> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Cart get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void save(Cart Cart) {
		// TODO Auto-generated method stub
		repo.save(Cart);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

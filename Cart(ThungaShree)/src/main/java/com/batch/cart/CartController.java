package com.batch.cart;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@Autowired
	private CartService service;
	
	@GetMapping("/Cart")
	public List<Cart> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/Cart/{id}")
	public ResponseEntity<Cart> get(@PathVariable Integer id)
	{
		try {
			Cart Cart = service.get(id);
			return new ResponseEntity<Cart>(Cart, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<Cart>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/Cart")
	public void add(@RequestBody Cart Cart)
	{
		service.save(Cart);
	}
	
	@PutMapping("/Cart/{id}")
	public ResponseEntity<?> update(@RequestBody Cart Cart, @PathVariable Integer id)
	{
		try {
			Cart existCart = service.get(id);
			service.save(Cart);
			return new ResponseEntity<>(Cart, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/Cart/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
}

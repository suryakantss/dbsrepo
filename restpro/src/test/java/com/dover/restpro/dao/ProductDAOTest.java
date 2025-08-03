package com.dover.restpro.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.dover.restpro.domain.Product;

@DataJpaTest

public class ProductDAOTest {
	@Autowired
	private ProductDAO productDAO;

	@Test
	public void testfindAll() {
		assertEquals(0, productDAO.findAll().size());
		productDAO.save(new Product("PX", "Charger Cable", 100));
		assertEquals(1, productDAO.findAll().size());

	}

	@Test
	public void testfindbyId() {
		productDAO.save(new Product("PX", "Charger Cable", 100));
		assertEquals("PX", productDAO.findById("PX").get().getId());

	}

	@Test
	public void testsave() {
		Product p = productDAO.save(new Product("PY", "Key Guard", 1100));
		assertEquals("PY", p.getId());
		assertEquals("Key Guard", p.getName());
		assertEquals(1100.0, p.getPrice());

	}
}

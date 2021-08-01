package com.tssa301.dscrud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tssa301.dscrud.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Alex Grey", "01234567891", 1200.00, null, 2));
		list.add(new Client(2L, "Ana Bela", "12345678902", 2500.00, null, 1));
		list.add(new Client(3L, "Mark Cour", "23456789103", 2000.00, null, 2));
		return ResponseEntity.ok().body(list);
	}
}

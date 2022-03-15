package com.service1.service;

import org.springframework.http.ResponseEntity;

public interface CRService {
	 ResponseEntity<String> createData();

	 ResponseEntity<String> getData();
}

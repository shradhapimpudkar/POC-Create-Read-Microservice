package com.service1.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CRServiceImpl implements CRService{

	public ResponseEntity<String> createData() {
		return new ResponseEntity<>("Create API called",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> getData() {
		return new ResponseEntity<String>("Read/Get API called",HttpStatus.OK);
	}
}

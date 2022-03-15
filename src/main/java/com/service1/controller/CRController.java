package com.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service1.service.CRService;

@RestController
@RequestMapping("/cr")
public class CRController {

	@Autowired
	CRService crService;

	@PostMapping(value = "create", produces = { MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<String> createData() {
		return crService.createData();
	}

	@GetMapping(value = "read", produces = { MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<String> getData() {
		return crService.getData();
	}
}

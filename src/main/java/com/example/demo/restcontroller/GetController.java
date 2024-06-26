package com.example.demo.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bao.StoreData;
import com.example.demo.dto.Attended;
import com.example.demo.dto.NotAttended;

@RestController()
public class GetController {

	@Autowired
	StoreData storeData;
	
	@GetMapping("/attendedData")
	public ResponseEntity<Map<Integer, Attended>> geAttendedtData(){
		return ResponseEntity.ok(StoreData.getAttendedMap());
				
	}
	@GetMapping("/notAttendeData")
	public ResponseEntity<Map<Integer, NotAttended>> getNotAttendedData(){
		return ResponseEntity.ok(StoreData.getNotAttendedMap());
				
	}
	
}

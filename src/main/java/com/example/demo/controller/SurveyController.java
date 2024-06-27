package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bao.StoreData;
import com.example.demo.dto.Attended;
import com.example.demo.dto.NotAttended;

import jakarta.servlet.http.HttpServletRequest;

@Controller()
public class SurveyController {

	@Autowired
	StoreData storeData;
	
	@GetMapping(path="/")
	public String index(Model model,HttpServletRequest request) {
		String ipAddress = request.getHeader("X-Forwarded-For");
		if (ipAddress == null || ipAddress.isEmpty()) {
            ipAddress = request.getRemoteAddr();
        } else {   ipAddress = ipAddress.split(",")[0].trim();
        }
		System.out.println(StoreData.getIpAddressSet());
		System.out.println(ipAddress);
		
		if(StoreData.getIpAddressSet().contains(ipAddress))
			return "thankYou";
		else
			StoreData.getIpAddressSet().add(ipAddress);
		model.addAttribute("attended",new Attended());
		model.addAttribute("notAttended",new NotAttended());
		return "index";
	}
	@PostMapping("/submitAttendedForm")
	public String submitFeedbackAttended(@ModelAttribute Attended attended) {
	        // Process feedback for attended users
		
		storeData.AddAttendedData(attended);
		System.out.println(StoreData.getAttendedMap());
		System.out.println(StoreData.getNotAttendedMap());
		return "thankYou";
	}
	@PostMapping("/submitNotAttendedForm")
	public String submitFeedbackNotAttended(@ModelAttribute NotAttended notAttended) {
	        // Process feedback for attended users
		storeData.AddNotAttendedData(notAttended);
		System.out.println(StoreData.getAttendedMap());
		System.out.println(StoreData.getNotAttendedMap());
		return "thankYou";
	}

}

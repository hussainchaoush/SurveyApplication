package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bao.StoreData;
import com.example.demo.dto.Attended;
import com.example.demo.dto.NotAttended;

@Controller("surveyapplication-production.up.railway.app")
public class SurveyController {

	@Autowired
	StoreData storeData;
	
	@RequestMapping(path="/index")
	public String index(Model model) {
		model.addAttribute("attended",new Attended());
		model.addAttribute("notAttended",new NotAttended());
		return "index";
	}
	@RequestMapping("/submitAttendedForm")
	public String submitFeedbackAttended(@ModelAttribute Attended attended) {
	        // Process feedback for attended users
		storeData.AddAttendedData(attended);
		System.out.println(StoreData.getAttendedMap());
		System.out.println(StoreData.getNotAttendedMap());
		return "thankYou";
	}
	@RequestMapping("/submitNotAttendedForm")
	public String submitFeedbackNotAttended(@ModelAttribute NotAttended notAttended) {
	        // Process feedback for attended users
		storeData.AddNotAttendedData(notAttended);
		System.out.println(StoreData.getAttendedMap());
		System.out.println(StoreData.getNotAttendedMap());
		return "thankYou";
	}
}

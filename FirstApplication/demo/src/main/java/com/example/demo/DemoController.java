package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ProfileData;
import com.example.demo.service.DemoService;
import com.example.demo.service.DemoServiceImpl;



//used to simplyfy the creation of Restful services
//@RestController : eliminates the need to annotate @Controller and @ResponseBody for every request handling method in controller class 
//@Controller : used in springmvc framework along with RequestMapping
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/v1")
public class DemoController {
	
	private DemoService demoService;  
	
	//creating instance of service class
	//constructor
	@Autowired
	public  DemoController(DemoServiceImpl demoService) {
		this.demoService = demoService;
	}
	
	@RequestMapping(value = "/getDetails/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody ProfileData profile, @PathVariable int id){
		
		
		//creating profileData object (object : is an instance of a class)
		ProfileData profileData = null; 
		profile.setId(id);
		System.out.println("profile id : " +profile.getId());
		profileData= demoService.saveProfile(profile);
		
		return new ResponseEntity<ProfileData>(profileData, HttpStatus.OK);
		
	}
	
	/*
	 * @RequestMapping(value = "/deleteDetails/{id}", method = RequestMethod.GET)
	 * public ResponseEntity<?> deleteData(@RequestBody ProfileData
	 * proData, @PathVariable int id){
	 * 
	 * ProfileData profileData = demoService.deleteData(proData);
	 * 
	 * 
	 * //return new ResponseEntity<ProfileData>(profileData, HttpStatus.OK); }
	 */
	
	
	@RequestMapping(value = "/getByName/{name}", method = RequestMethod.GET)
	public ResponseEntity<?> getByName(@RequestBody ProfileData profile, @PathVariable int name){
		
			 
		System.out.println("profile id : " +profile.getId());
		ProfileData	profileData= demoService.getByName(profile);
		
		return new ResponseEntity<ProfileData>(profileData, HttpStatus.OK);
		
	}
	

}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.domain.ProfileData;
import com.example.demo.repository.DemoRepo;

@Service
public class DemoServiceImpl implements DemoService{
	
	
	private DemoRepo demoRepo;
	
	@Autowired  //creating instance of repository
	public DemoServiceImpl(DemoRepo demoRepository) {
		this.demoRepo = demoRepository;
	}

	

	@Override
	public ProfileData saveProfile(ProfileData profile) {
		
		ProfileData proData = demoRepo.save(profile);
		
		//return new ResponseEntity<ProfileData>(proData, HttpStatus.OK);
		return proData;
	}



	@Override
	public ProfileData getByName(ProfileData profile) {
	
		
		ProfileData profileData = demoRepo.getByName(profile);
		
		
		
		return profileData;
	}

	
	
	
	
	/*
	 * @Override public void deleteData(ProfileData profile) {
	 * 
	 * ProfileData proData = demoRepo.delete(profile);;
	 * 
	 * //return new ResponseEntity<ProfileData>(proData, HttpStatus.OK); //return
	 * null; }
	 */
	
}

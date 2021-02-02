package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.ProfileData;


public interface DemoService {

	public ProfileData saveProfile(ProfileData profile);

	//public void deleteData(ProfileData proData);

	public ProfileData getByName(ProfileData profile);
	

}

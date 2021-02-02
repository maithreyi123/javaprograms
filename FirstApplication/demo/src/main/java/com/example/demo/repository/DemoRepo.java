package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ProfileData;


@Repository
//@EnableMongoRepositories
public interface DemoRepo extends CrudRepository<ProfileData, Integer>{

  //public void save(int id);

//public ProfileData saveProfile(ProfileData profile);

@SuppressWarnings("unchecked")
public ProfileData save(ProfileData profile);

public void delete(ProfileData profile);

public ProfileData getByName(ProfileData profile);

}

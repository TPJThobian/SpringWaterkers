package com.Waterkers.Spring;

import org.springframework.data.repository.CrudRepository;

import com.Waterkers.Spring.Data;

public interface DataRepository extends CrudRepository<Data, Integer>{
}

//public interface UserRepository extends CrudRepository<User, Integer>
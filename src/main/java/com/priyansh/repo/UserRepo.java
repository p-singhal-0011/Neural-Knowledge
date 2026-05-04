package com.priyansh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyansh.entity.MyUser;

@Repository
public interface UserRepo extends JpaRepository<MyUser, String> {

}
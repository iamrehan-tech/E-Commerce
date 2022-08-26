package com.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}

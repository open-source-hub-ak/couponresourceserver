package com.opensource.couponresourceserver.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opensource.couponresourceserver.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findByEmail(String email);
}

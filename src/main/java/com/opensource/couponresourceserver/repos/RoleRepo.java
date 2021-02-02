package com.opensource.couponresourceserver.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opensource.couponresourceserver.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}

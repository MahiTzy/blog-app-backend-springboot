package com.mahicodecrafts.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahicodecrafts.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}

package com.viaflow.challengetwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaflow.challengetwo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByLogin(String login);
}

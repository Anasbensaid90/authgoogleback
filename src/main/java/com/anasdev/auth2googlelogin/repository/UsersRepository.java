package com.anasdev.auth2googlelogin.repository;

import com.anasdev.auth2googlelogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);

}

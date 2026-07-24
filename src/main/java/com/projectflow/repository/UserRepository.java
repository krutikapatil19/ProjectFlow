package com.projectflow.projectflow.repository;

import com.projectflow.projectflow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

//By extending JpaRepository<User, Long> we instantly get methods like save(user) - insert or update a user , findById(id), findAll(), deleteById(id)
public interface UserRepository extends JpaRepository<User, Long> {

    //findBy + Email -> Spring understands find a User where the email field matches whats passed in.
    Optional<User> findByEmail(String email);

}
package com.example.AssistantMentor.repository;

import com.example.AssistantMentor.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto,Integer> {
}

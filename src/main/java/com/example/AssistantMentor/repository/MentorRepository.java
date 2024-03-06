package com.example.AssistantMentor.repository;

import com.example.AssistantMentor.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MentorRepository extends JpaRepository<Mentor,Integer> {
    Optional<Mentor> findBymentorId(int mentorId);
}

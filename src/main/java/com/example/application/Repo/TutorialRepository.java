package com.example.application.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.pojo.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}

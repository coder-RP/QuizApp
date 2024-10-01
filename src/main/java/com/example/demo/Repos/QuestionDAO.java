package com.example.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Questions;

@Repository
public interface QuestionDAO extends JpaRepository<Questions, Integer> {
	List<Questions> findByCategory(String category);
}

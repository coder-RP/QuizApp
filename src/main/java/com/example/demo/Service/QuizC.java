package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Questions;
import com.example.demo.Repos.QuestionDAO;

@Service
public class QuizC {
	@Autowired
	QuestionDAO QD;
	public List<Questions> allQuestion() {
		List<Questions> allQue=QD.findAll();
		return allQue;
	}
	public List<Questions> getCategory(String Category) {
		return QD.findByCategory(Category);  
	}
	public String add(Questions que) {
	QD.save(que);
		return "Success";
	}
	public Questions updateQue(Questions que) {
		QD.save(que);
		return que;
	}
	public String deleteQue(int id) {
		QD.deleteById(id);
		return "Deleted succesfully";
	}
}

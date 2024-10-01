package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Questions;
import com.example.demo.Service.QuizC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class QuestionController {
	@Autowired
	QuizC quiz;
@GetMapping("allque")
public List<Questions> allQuestion(){
    return quiz.allQuestion();
}
@GetMapping("question/{category}")
public List<Questions> getCategory(@PathVariable String category) {
    return quiz.getCategory(category);
}
@PostMapping("/add")
public String add(@RequestBody Questions que) {
	return quiz.add(que);
}
@PutMapping("update")
public Questions updateQue(@RequestBody Questions que) {
   return quiz.updateQue(que);
}
@DeleteMapping("Delete/{id}")
public String deleteQue(@PathVariable int id) {
	return quiz.deleteQue(id);
}
}

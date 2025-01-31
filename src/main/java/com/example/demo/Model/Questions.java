package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
	@Id
private Integer id;
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String RightAnswer;
	private String Level;
	private String category;	
	public String getCategory() {
		return category;
	}
	public void setCategory(String Category) {
		this.category = Category;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	public String getRightAnswer() {
		return RightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		RightAnswer = rightAnswer;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", Question=" + Question + ", Option1=" + Option1 + ", Option2=" + Option2
				+ ", Option3=" + Option3 + ", Option4=" + Option4 + ", RightAnswer=" + RightAnswer + ", Level=" + Level
				+ ", Category=" + category + "]";
	}
	
	
	}

package com.hibernateannotationonetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "questiontable")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String questionname;

	// creating coloumn on answer table

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "qid")
	@OrderColumn(name = "type")

	private List<Answer> answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionname() {
		return questionname;
	}

	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

}

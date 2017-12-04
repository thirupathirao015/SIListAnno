package net.umapath;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Question {
	
	private int id;  
	private String name;  
	@Autowired
	private List<Answers> answers;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Answers> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}


	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<Answers> itr=answers.iterator();  
	    while(itr.hasNext()){  
	       // System.out.println(itr.next()); 
	    	Answers ans=itr.next();
	    	System.out.println(ans.getId()+"  "+ans.getAns()+"  "+ans.getBy());
	    }  

	}
}

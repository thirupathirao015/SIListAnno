package net.umapath;

public class Answers {
	
	private int id;  
	private String ans,by;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	@Override
	public String toString() {
		return "Answers [id=" + id + ", ans=" + ans + ", by=" + by + "]";
	}  
	
	
}

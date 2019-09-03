package entity;

public class User {
	private Integer id;
	private String name;
	private String pass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public User() {
		
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

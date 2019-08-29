package entity;

public class Student {
	private int id;
	private String name;
	private int sex;
	
	
	public static String[] sexs = {"²»ÏÞ","ÄÐ","Å®"};
	
	public String getSexname() {
		return sexs[sex];
	}
	
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Student() {
		super();
	}
	public Student(int id, String name, int sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
	
}

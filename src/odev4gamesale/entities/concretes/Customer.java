package odev4gamesale.entities.concretes;

public class Customer {
	private int id;
	private String name;
	private String surname;
	private int birthday;
	private String identificationId;
	public Customer() {
		
	}
	public Customer(int id, String name, String surname, int birthday, String identificationId) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.identificationId = identificationId;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getIdentificationId() {
		return identificationId;
	}
	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}
	
	
	
	
}


package com.ymd.libsys.domain;

public class SystemUser extends Person {
	
	private String userName;
	
	private String password;
	
	private Librarian librarian;
	
	private Administrator admin;
	
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	public Librarian getLibrarian() {
		return librarian;
	}

	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}

	public Administrator getAdmin() {
		return admin;
	}

	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}

	public int login(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
		
		return 0;
	}

}

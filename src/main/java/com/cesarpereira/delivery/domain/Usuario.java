package com.cesarpereira.delivery.domain;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer	Id;
	private String	Email;
	private String Name;
	private String Password;
	private String Phone;
	private Date Dta_cadastro;
	
	public Usuario() {
				
	}

		
	public Usuario(Integer id, String email, String name, String password, String phone, Date dta_cadastro) {
		super();
		Id = id;
		Email = email;
		Name = name;
		Password = password;
		Phone = phone;
		Dta_cadastro = dta_cadastro;
	}



	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public Date getDta_cadastro() {
		return Dta_cadastro;
	}

	public void setDta_cadastro(Date dta_cadastro) {
		Dta_cadastro = dta_cadastro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	

		
	
}



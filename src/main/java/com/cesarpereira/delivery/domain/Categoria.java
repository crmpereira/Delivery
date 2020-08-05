package com.cesarpereira.delivery.domain;

import java.io.Serializable;

public class Categoria implements Serializable {

	   
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String Nome;
	
	public Categoria() {
		
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	
	
	public Categoria(Integer Id, String Nome) {
		super();
		this.Id = Id;
		this.Nome = Nome;
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
		Categoria other = (Categoria) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}	
	
}
	

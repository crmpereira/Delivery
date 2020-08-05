package com.cesarpereira.delivery.domain;

public class Produto_Categoria {

	
	private Integer produto_id;
	private Integer categoria_id;
	
	
	public Produto_Categoria() {
		
	}
	

	public Produto_Categoria(Integer produto_id, Integer categoria_id) {
		super();
		this.produto_id = produto_id;
		this.categoria_id = categoria_id;
	}



	public Integer getProduto_id() {
		return produto_id;
	}
	public void setProduto_id(Integer produto_id) {
		this.produto_id = produto_id;
	}
	public Integer getCategoria_id() {
		return categoria_id;
	}
	public void setCategoria_id(Integer categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria_id == null) ? 0 : categoria_id.hashCode());
		result = prime * result + ((produto_id == null) ? 0 : produto_id.hashCode());
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
		Produto_Categoria other = (Produto_Categoria) obj;
		if (categoria_id == null) {
			if (other.categoria_id != null)
				return false;
		} else if (!categoria_id.equals(other.categoria_id))
			return false;
		if (produto_id == null) {
			if (other.produto_id != null)
				return false;
		} else if (!produto_id.equals(other.produto_id))
			return false;
		return true;
	}
	
	
	
	
}
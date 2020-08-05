package com.cesarpereira.delivery.domain;

import java.io.Serializable;
import java.util.Date;

public class Produto implements Serializable {

	
		private static final long serialVersionUID = 1L;
		private Integer Id;    
		private String descricao;
		private String image_url;
		private String nome;
		private Double preco;
		private Date dta_cadastro;
		
		public Produto() {
			
		}
				
		
		public Produto(Integer id, String descricao, String image_url, String nome, Double preco, Date dta_cadastro) {
			super();
			Id = id;
			this.descricao = descricao;
			this.image_url = image_url;
			this.nome = nome;
			this.preco = preco;
			this.dta_cadastro = dta_cadastro;
		}


		public Integer getId() {
			return Id;
		}
		
		public Date getDta_cadastro() {
			return dta_cadastro;
		}


		public void setDta_cadastro(Date dta_cadastro) {
			this.dta_cadastro = dta_cadastro;
		}


		public void setId(Integer id) {
			Id = id;
		}
		
		public String getDescricao() {
			return descricao;
		}
		
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public String getImage_url() {
			return image_url;
		}
		
		public void setImage_url(String image_url) {
			this.image_url = image_url;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Double getPreco() {
			return preco;
		}
		
		public void setPreco(Double preco) {
			this.preco = preco;
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
			Produto other = (Produto) obj;
			if (Id == null) {
				if (other.Id != null)
					return false;
			} else if (!Id.equals(other.Id))
				return false;
			return true;
		}
	
}
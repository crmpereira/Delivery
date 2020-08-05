
package com.cesarpereira.delivery.domain;

import java.io.Serializable;

public class Pedido_Item implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double Preco;
	private Integer Quantidade;
	private Integer Produto_Id;
	private Integer Pedido_Id;

	public Pedido_Item() {
		
	}
	
	
	public Pedido_Item(Double preco, Integer quantidade, Integer produto_Id, Integer pedido_Id) {
		super();
		Preco = preco;
		Quantidade = quantidade;
		Produto_Id = produto_Id;
		Pedido_Id = pedido_Id;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}

	public Integer getProduto_Id() {
		return Produto_Id;
	}

	public void setProduto_Id(Integer produto_Id) {
		Produto_Id = produto_Id;
	}

	public Integer getPedido_Id() {
		return Pedido_Id;
	}

	public void setPedido_Id(Integer pedido_Id) {
		Pedido_Id = pedido_Id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pedido_Id == null) ? 0 : Pedido_Id.hashCode());
		result = prime * result + ((Produto_Id == null) ? 0 : Produto_Id.hashCode());
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
		Pedido_Item other = (Pedido_Item) obj;
		if (Pedido_Id == null) {
			if (other.Pedido_Id != null)
				return false;
		} else if (!Pedido_Id.equals(other.Pedido_Id))
			return false;
		if (Produto_Id == null) {
			if (other.Produto_Id != null)
				return false;
		} else if (!Produto_Id.equals(other.Produto_Id))
			return false;
		return true;
	}
	
	
	
	
	
	
}
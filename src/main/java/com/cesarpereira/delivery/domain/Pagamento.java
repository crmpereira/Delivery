package com.cesarpereira.delivery.domain;

import java.io.Serializable;
import java.util.Date;

public class Pagamento implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	private Date Dta_Pagamento;
	private Integer Pedido_Id;
	
	public Pagamento() {
		
	}
	
	
	public Pagamento(Date dta_Pagamento, Integer pedido_Id) {
		super();
		Dta_Pagamento = dta_Pagamento;
		Pedido_Id = pedido_Id;
	}

	public Date getDta_Pagamento() {
		return Dta_Pagamento;
	}

	public void setDta_Pagamento(Date dta_Pagamento) {
		Dta_Pagamento = dta_Pagamento;
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
		Pagamento other = (Pagamento) obj;
		if (Pedido_Id == null) {
			if (other.Pedido_Id != null)
				return false;
		} else if (!Pedido_Id.equals(other.Pedido_Id))
			return false;
		return true;
	}
		
	
}
package com.cesarpereira.delivery.domain;

import java.io.Serializable;
import java.util.Date;

public class Pedido  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private Date Dta_Pedido;
	private Integer Pedido_Status;
	private Integer Cliente_Id;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date dta_Pedido, Integer pedido_Status, Integer cliente_Id) {
		super();
		Id = id;
		Dta_Pedido = dta_Pedido;
		Pedido_Status = pedido_Status;
		Cliente_Id = cliente_Id;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getDta_Pedido() {
		return Dta_Pedido;
	}

	public void setDta_Pedido(Date dta_Pedido) {
		Dta_Pedido = dta_Pedido;
	}

	public Integer getPedido_Status() {
		return Pedido_Status;
	}

	public void setPedido_Status(Integer pedido_Status) {
		Pedido_Status = pedido_Status;
	}

	public Integer getCliente_Id() {
		return Cliente_Id;
	}

	public void setCliente_Id(Integer cliente_Id) {
		Cliente_Id = cliente_Id;
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
		Pedido other = (Pedido) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
	

	
	
}
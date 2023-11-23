package br.com.pdv.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name ="item", schema = "pdv")
public class ItemEntidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	 
	@Column(name = "idprod")
	private Long idprod;
	public Long getIdprod() {
		return id;
	}
	public void setIdprod(Long id) {
		this.id = id;
	}
	
	@Column(name = "quant")
	private Long quant;
	public Long  getQuant() {
		return quant;
	}
	
	public void setQuant(Long quant) {
		this.quant = quant;
	}
	
}


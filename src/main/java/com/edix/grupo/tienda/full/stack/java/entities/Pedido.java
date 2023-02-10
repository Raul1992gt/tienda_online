package com.edix.grupo.tienda.full.stack.java.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedidos")
    private Integer id;

    @Column(name = "fecha_realizacion")
    private Date fechaRealizacion;

    @ManyToOne
    @JoinColumn(name = "id_usuarios", referencedColumnName = "id_usuario")
    private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pedido() {
		super();
	}

    
}

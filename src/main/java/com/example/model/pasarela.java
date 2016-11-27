package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="USUARIO")
public class pasarela implements Serializable{

	public static final long serialVersionID =1L;
	public static long nextId = 0L;
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name ="NOMBRE")
	private String nombre;
	@Column(name ="CODIGO")
	private String codigo;
	@Column(name ="CORREO")
	private String correo;
	@Column(name ="ESCUELA")
	private String escuela;
	
	
	
	
	public pasarela() {
		super();
	}
	public pasarela(String nombre, String codigo, String correo, String escuela) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.correo = correo;
		this.escuela = escuela;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEscuela() {
		return escuela;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	@Override
	public String toString() {
		return "pasarela [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", correo=" + correo + ", escuela="
				+ escuela + "]";
	}
	
	
	
	
	
	
	
}

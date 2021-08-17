package net.javaguides.usermanagement.model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class Agenda {
	private int id;
	private String categoria;
	private String descricao;
	
	public Agenda(String categoria, String descricao) {
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public Agenda(int id, String categoria, String descricao) {
		this.id = id;
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public Agenda() {
	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
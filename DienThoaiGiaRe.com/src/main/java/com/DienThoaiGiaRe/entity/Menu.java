package com.DienThoaiGiaRe.entity;
// Generated Dec 20, 2020, 2:43:06 PM by Hibernate Tools 5.4.21.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name = "menu")
public class Menu implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1519466467395797315L;
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="title")
	private String title;
	
	@Column(name ="idCategory")
	private Integer idCategory;

	public Menu() {
	}

	public Menu(int id) {
		this.id = id;
	}

	public Menu(int id, String title, Integer idCategory) {
		this.id = id;
		this.title = title;
		this.idCategory = idCategory;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

}

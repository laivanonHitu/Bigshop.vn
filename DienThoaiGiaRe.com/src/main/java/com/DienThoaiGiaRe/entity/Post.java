package com.DienThoaiGiaRe.entity;
// Generated Dec 20, 2020, 2:43:06 PM by Hibernate Tools 5.4.21.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post implements java.io.Serializable {

	private static final long serialVersionUID = -8169340011528774726L;
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="description")
	private String description;
	
	@Column(name ="idProduct")
	private Integer idProduct;
	
	@Column(name ="title")
	private String title;
	
	@Column(name ="shortDescription")
	private String shortDescription;

	public Post() {
	}

	public Post(int id) {
		this.id = id;
	}

	public Post(int id, String description, Integer idProduct, String title, String shortDescription) {
		this.id = id;
		this.description = description;
		this.idProduct = idProduct;
		this.title = title;
		this.shortDescription = shortDescription;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

}

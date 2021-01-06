package com.bigshop.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 7496271916357336817L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private Double price;

	@Column(name = "price_dis")
	private Double price_dis;

	@Column(name = "image")
	private String image;

	@Column(name = "image_thumnail")
	private String image_thumnail;

	@Column(name = "image_large")
	private String image_large;

	@Column(name = "short_decription")
	private String short_decription;

	@Column(name = "decription")
	private String decription;

	@Column(name = "weight")
	private String weight;

	@Column(name = "inventory")
	private int inventory;

	@Column(name = "product_code")
	private String product_code;

	@Column(name = "brand")
	private String brand;

	@Column(name = "id_category")
	private int id_category;

	@Column(name = "hidden")
	private boolean hidden;

	@Column(name = "modifieddate")
	private Timestamp modifieddate;
	
	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Timestamp getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice_dis() {
		return price_dis;
	}

	public void setPrice_dis(Double price_dis) {
		this.price_dis = price_dis;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getShort_decription() {
		return short_decription;
	}

	public void setShort_decription(String short_decription) {
		this.short_decription = short_decription;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getImage_thumnail() {
		return image_thumnail;
	}

	public void setImage_thumnail(String image_thumnail) {
		this.image_thumnail = image_thumnail;
	}

	public String getImage_large() {
		return image_large;
	}

	public void setImage_large(String image_large) {
		this.image_large = image_large;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public Product() {
		super();
	}

	public Product(String name, Double price, Double price_dis, String image, String image_thumnail, String image_large,
			String short_decription, String decription, String weight, int inventory, String product_code, String brand,
			int id_category, boolean hidden, Timestamp modifieddate) {
		super();
		this.name = name;
		this.price = price;
		this.price_dis = price_dis;
		this.image = image;
		this.image_thumnail = image_thumnail;
		this.image_large = image_large;
		this.short_decription = short_decription;
		this.decription = decription;
		this.weight = weight;
		this.inventory = inventory;
		this.product_code = product_code;
		this.brand = brand;
		this.id_category = id_category;
		this.hidden = hidden;
		this.modifieddate = modifieddate;
	}

	public Product(int id, String name, Double price, Double price_dis, String image, String image_thumnail,
			String image_large, String short_decription, String decription, String weight, int inventory,
			String product_code, String brand, int id_category, boolean hidden, Timestamp modifieddate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.price_dis = price_dis;
		this.image = image;
		this.image_thumnail = image_thumnail;
		this.image_large = image_large;
		this.short_decription = short_decription;
		this.decription = decription;
		this.weight = weight;
		this.inventory = inventory;
		this.product_code = product_code;
		this.brand = brand;
		this.id_category = id_category;
		this.hidden = hidden;
		this.modifieddate = modifieddate;
	}

	public Product(String name) {
		super();
		this.name = name;
	}

}

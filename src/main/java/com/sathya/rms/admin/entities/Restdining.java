package com.sathya.rms.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Restdining")
public class Restdining {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	
	@Transient
	private String rid;
	
	@Transient
	private String did;
	
	
	@ManyToOne
	@JoinColumn(name="rid")
	private Restaurant restaurant;
	
	@ManyToOne
	@JoinColumn(name="did")
	private Dining dining;

	public Restdining() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Dining getDining() {
		return dining;
	}

	public void setDining(Dining dining) {
		this.dining = dining;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Restdining [id=" + id + ", rid=" + rid + ", did=" + did + ", restaurant=" + restaurant + ", dining="
				+ dining + "]";
	}
	
}

package com.sathya.rms.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Restdining2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="eid",unique = true)
	private String eid;
	
	@Column(name = "ename")
	private String ename;
	
	
	@Column(name = "salary")
	private Integer salary;
	
	@ManyToOne
	@JoinColumn(name = "phno")
	private Restaurant restaurant;
	
	
	@ManyToOne
	@JoinColumn(name = "desig")
	private Designation designation;
	
	
	@ManyToOne
	@JoinColumn(name="rid")
	private Restdining restdining;


	public Restdining2() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	public Designation getDesignation() {
		return designation;
	}


	public void setDesignation(Designation designation) {
		this.designation = designation;
	}


	public Restdining getRestdining() {
		return restdining;
	}


	public void setRestdining(Restdining restdining) {
		this.restdining = restdining;
	}


	@Override
	public String toString() {
		return "Restdining2 [id=" + id + ", eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", restaurant="
				+ restaurant + ", designation=" + designation + ", restdining=" + restdining + "]";
	}

}

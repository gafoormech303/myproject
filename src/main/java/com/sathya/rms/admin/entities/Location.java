package com.sathya.rms.admin.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "location")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Transient
	private String cid;
	
	
	@Column(name="locid",unique = true)
    private String locId;
	
	
	@Column(name="lname")
	private String locName;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private City city;


    @OneToMany(mappedBy = "location")
	private Set<Restaurant> restaurant;
	
	
	public Location() {
		super();
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", cid=" + cid + ", locId=" + locId + ", locName=" + locName + ", city=" + city
				+ "]";
	}

	

}

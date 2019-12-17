package com.sathya.rms.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " Designation")
public class Designation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	
	@Column(name="desigid",unique = true,nullable = true)
	private String desigId;

	
	@Column(name = "designame")
	private String desigName;

	public Designation() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesigId() {
		return desigId;
	}

	public void setDesigId(String desigId) {
		this.desigId = desigId;
	}

	public String getDesigName() {
		return desigName;
	}

	@Override
	public String toString() {
		return "Designation [Id=" + id + ", desigId=" + desigId + ", desigName=" + desigName + "]";
	}

	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}


}

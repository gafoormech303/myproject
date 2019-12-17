package com.sathya.rms.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "EmployeeShift")
public class EmployeeShift {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private Integer id;
	
	
	
	@ManyToOne
	@JoinColumn(name = "eid")
	private Restdining2 restdining2;
	
	
	
	@ManyToOne
	@JoinColumn(name = "sttype")
	private ShiftType shiftType;
	
	
	@Column(name="date")
	private String date;


	public EmployeeShift() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Restdining2 getRestdining2() {
		return restdining2;
	}


	public void setRestdining2(Restdining2 restdining2) {
		this.restdining2 = restdining2;
	}


	public ShiftType getShiftType() {
		return shiftType;
	}


	public void setShiftType(ShiftType shiftType) {
		this.shiftType = shiftType;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "EmployeeShift [id=" + id + ", restdining2=" + restdining2 + ", shiftType=" + shiftType + ", date="
				+ date + "]";
	} 
	
	
}

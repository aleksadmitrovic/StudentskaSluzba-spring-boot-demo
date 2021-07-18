package com.demo.studentskaSluzba.student;

import java.time.LocalDate;

public class Student {

	private Long id;
	private String index;
	private String ime;
	private String prezime;
	private String grad;
	private LocalDate datumRodjenja;

	public Student() {
		
	}

	public Student(Long id, String index, String ime, String prezime, String grad, LocalDate datumRodjenja) {
		this.id = id;
		this.index = index;
		this.ime = ime;
		this.prezime = prezime;
		this.grad = grad;
		this.datumRodjenja = datumRodjenja;
	}

	public Student(String index, String ime, String prezime, String grad, LocalDate datumRodjenja) {
		this.index = index;
		this.ime = ime;
		this.prezime = prezime;
		this.grad = grad;
		this.datumRodjenja = datumRodjenja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	
	

}

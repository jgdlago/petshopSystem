package com.petshopSystem.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "petshop")
public class Petshop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPetshop;
	
    @Column(nullable = false, length = 150)
	private String name;
	
    @Column(nullable = true, length = 200)
	private String address;
	
    @Column(nullable = true, length = 15)
	private String phone;
    
    @Column(unique = true, nullable = false, length = 15)
    private String userName;
    
    @Column(nullable = false)
    private String userPassword;

	public Long getIdPetshop() {
		return idPetshop;
	}

	public void setIdPetshop(Long idPetshop) {
		this.idPetshop = idPetshop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}

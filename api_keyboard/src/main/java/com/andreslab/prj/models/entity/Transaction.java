package com.andreslab.prj.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	private Float amount; 
	private String type;
	
	@Column(name="origin_account")
	private String originAccount;
	
	@Column(name="destiny_account")
	private String destinyAccount;
	
	@Column(name="origin_type_account")
	private String originTypeAccount;
	
	@Column(name="destiny_type_account")
	private String destinyTypeAccount;
	
}


package com.example.spring.mongo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection="accts")
public class Account {
	
	@Id
	int acctId;
	String acctName;
	double acctBal;
	Date acctDob;

}

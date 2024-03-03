package com.in28minutes.LEarn.SpringAOPexample.bussiness;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.in28minutes.LEarn.SpringAOPexample.DataSErvice.DataService;
@Service
public class BussinessService1 {
	
private DataService dataservice1;

			@Autowired
			public BussinessService1(DataService dataservice1) {
	super();
	this.dataservice1 = dataservice1;
}


			public int calculateMax() {
			int [] data=dataservice1.retrieveData();
			return Arrays.stream(data).max().orElse(0);
			
			}
}
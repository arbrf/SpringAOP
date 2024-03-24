package com.in28minutes.LEarn.SpringAOPexample.bussiness;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.in28minutes.LEarn.SpringAOPexample.DataSErvice.DataService;
import com.in28minutes.LEarn.SpringAOPexample.DataSErvice.DataService2;
@Service
public class BussinessService2 {
	
private DataService2 dataservice2;

			@Autowired
			public BussinessService2(DataService2 dataservice2) {
	super();
	this.dataservice2 = dataservice2;
}


			public int calculateMin() throws InterruptedException {
			int [] data=dataservice2.retrieveData();
//			throw new RuntimeErrorException(null, "Something went wromg");
			return Arrays.stream(data).min().orElse(0);
			
			}
}
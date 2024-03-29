package com.in28minutes.LEarn.SpringAOPexample.bussiness;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.in28minutes.LEarn.SpringAOPexample.DataSErvice.DataService;
import com.in28minutes.LEarn.SpringAOPexample.annotation.TrackTime;
@Service
public class BussinessService1 {
	
private DataService dataservice1;

			@Autowired
			public BussinessService1(DataService dataservice1) {
	super();
	this.dataservice1 = dataservice1;
}

			@TrackTime
			public int calculateMax() {
			int [] data=dataservice1.retrieveData();
//			throw new RuntimeErrorException(null, "Something went wromg");
			return Arrays.stream(data).max().orElse(0);
			
			}
}
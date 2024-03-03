package com.in28minutes.LEarn.SpringAOPexample.DataSErvice;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
	public int[] retrieveData() {
		return new int[] {1,2,3,45,5};
	}

}

package com.in28minutes.LEarn.SpringAOPexample.DataSErvice;

import org.springframework.stereotype.Repository;

import com.in28minutes.LEarn.SpringAOPexample.annotation.TrackTime;

@Repository
public class DataService2 {
	@TrackTime
	public int[] retrieveData() throws InterruptedException {
		Thread.sleep(30);
		return new int[] {111,222,333,345,445};
	}

}

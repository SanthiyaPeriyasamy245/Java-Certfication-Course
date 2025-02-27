package com.Modularization.UserTesting;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.Modularization.Sorting.Sorting;

public class ConsumerTesting {
	
	private static Logger logger=Logger.getLogger(ConsumerTesting.class.getName());
	
	public static void main(String[]args)
	{
		
		List<String>names=new ArrayList<>(List.of("Saraswathy","Sivakumar","Periyasamy","Gowtham","Santhiya"));
		Sorting sort=new Sorting();
		List<String>answer=sort.sorting(names);
		logger.info(answer.toString());
		
	}

}

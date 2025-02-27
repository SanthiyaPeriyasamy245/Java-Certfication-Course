package com.Modularization.Sorting;

import java.util.List;

import com.Modularization.SortingAlgorithm.BubbleSorting;

public class Sorting {
     public List<String> sorting(List<String>names)
     {
    	 BubbleSorting bs=new BubbleSorting();
    	 return bs.sort(names);
     }
}

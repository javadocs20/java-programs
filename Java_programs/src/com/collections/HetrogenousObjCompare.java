package com.collections;

import java.util.Arrays;
import java.util.Comparator;

public class HetrogenousObjCompare  implements Comparator<Object>{
	
	public static void main(String[] args) {
	    Object[] inputData = { new String("pizza"), new Integer(0),
	            new String("apples"), new Integer(5), new String("pizza"),
	            new Integer(3), new Integer(7), new Integer(5) };
	    Arrays.sort(inputData, new HetrogenousObjCompare());
	    System.out.println(Arrays.asList(inputData));
	    
	    int x=5>>>1;
	    System.out.println(x);
	}

	public int compare(Object o1, Object o2) {
	    if (o1.getClass().equals(o2.getClass())) {
	        return ((Comparable)o1).compareTo((Comparable)o2);
	    } else {
	        if(o1.getClass().getCanonicalName().equals("java.lang.String")){
	            return 1;
	        } else {
	            return -1;
	        }
	    }

	}

}


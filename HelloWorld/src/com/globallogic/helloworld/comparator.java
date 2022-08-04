package com.globallogic.helloworld;
import java.util.*;
public class comparator implements Comparator<comparable> {

	@Override
	public int compare(comparable o1, comparable o2) {
		// TODO Auto-generated method stub
		return o1.getPh()-o2.getPh();
	}

//	public int compare(comparable o1, comparable o2) {
//		// TODO Auto-generated method stub
//		return o1.getName().compareTo(o2.getName());
//	}
	
	

}

package org.cap.bankapp.test;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class TestTheory {

	
@DataPoints

public static int[] myInputs(){
	return new int[]{
			2,4,6,7,-4
	};
}


@Theory

public void proveMyTheory(Integer a, Integer b){
	System.out.println(a +"-->"  +b);
	//Assume.assumeTrue(b);
}




}

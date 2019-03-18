package com.naztech.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

import com.naztech.lambda.Dao.Calculator;

public class CalculatorTest {

	@Test
	public void test() {
/*		
		Calculator add=new Calculator() {
			public double calculate(Number a,Number b) {
				return b.doubleValue() + a.doubleValue();
				
			}

		};
*/
	
		Calculator add=(Number a,Number b)->{
			  return a.doubleValue() + b.doubleValue();
	  };
	  	Calculator sub=(Number a,Number b)->{
		  return a.doubleValue() - b.doubleValue();
	  };
	  	Calculator mul=(Number a,Number b)->{
		  return a.doubleValue() * b.doubleValue();
	  };
	  @SuppressWarnings("finally")
	  Calculator div=(Number a,Number b)->{
		  Double result=null;
		  try {
			  result= a.doubleValue() / b.doubleValue();
		  }catch(Exception e){
			  System.out.println(e);
		  }finally {
			  return result;
		  }
	  	};		
		assertEquals((int)(add.calculate(10, 20)),30);
		assertEquals((int)(sub.calculate(10, 20)),-10);
		assertEquals((int)(mul.calculate(10, 20)),200);
		assertEquals((int)(div.calculate(10, 10)),1);
	}

}



import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.Test;

public class Junitprobandotest {

	public static void mai(String[] args) {
		
		JUnitCore.runClasses(VehiculosApp.class);
		
		
		
	}
	@Test
	public void test() {
		Vehiculo pr1= new Vehiculo("0423","seat", "sara");
		
		Assert.assertEquals("mala " , pr1.getModelo() );
		
	}
	
	
	
	

}

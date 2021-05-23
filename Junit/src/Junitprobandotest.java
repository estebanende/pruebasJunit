

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.Test;

public class Junitprobandotest {

	public static void mai(String[] args) {
		
		JUnitCore.runClasses(Junitprobandotest.class);
		
		
		
	}
	/*@Test
	public void test() {
		Vehiculo pr1= new Vehiculo("0423","seat", "sara");
		
		Assert.assertEquals("mala " , pr1.getModelo() );
		*/
	//}
	@Test
	public void testWrite() {
		Vehiculo v1=new Vehiculo("CFC 6666","BMW","X3");
		EscritorObjetos eo1=new EscritorObjetos("v1.obt");
		System.out.println("probando write() : ");
		Assert.assertEquals(1, eo1.write(v1));
				
				
	}
	@Test
	public void testeandoadd() {
		Vehiculo v1=new Vehiculo("CFC 6666","BMW","X3");
		EscritorObjetos eo1=new EscritorObjetos("v1.obt");
		System.out.println("probando write() : ");
		Assert.assertEquals(1, eo1.add(v1));
	}
	
	@Test
	public  void probandoArraytest()
	{
		
		Vehiculo v1=new Vehiculo("CFC 6666","BMW","X3");
		EscritorObjetos eo1=new EscritorObjetos("v1.obt");
		System.out.println("probando write() : ");
		Vehiculo arra []=new Vehiculo [4] ;
		Assert.assertEquals(4,eo1.add(arra));
	}
	
	@Test
	public  void ProbandoWriteArra()
	{
		Vehiculo v1=new Vehiculo("CFC 6666","BMW","X3");
		EscritorObjetos eo1=new EscritorObjetos("v1.obt");
		System.out.println("probando write() : ");
		Vehiculo arra []=new Vehiculo [4] ;
		Assert.assertEquals(4,eo1.write(arra));
	}
	

	@Test
	public void leerobjetos()
	{
		
	}
	
 
	
	
	

}

/*
 * Shows how to use an enumeration in Java
 */

enum Transport {
	CAR, BOAT, PLANE, TRUCK, TRAIN
}


public class Transportation {

	public static void main(String []args){
		
		Transport tp; //declaring a Transport reference
		
		tp = Transport.BOAT;
		
		System.out.println("The value of tp is " + tp);
		
		tp = Transport.CAR;
		
		System.out.println("The value of tp is " + tp);
		
		switch (tp) {
		case CAR:
			System.out.println("A car carries people");
			break;
		case TRUCK:
			System.out.println("A truck carries freight");
			break;
		case PLANE:
			System.out.println("A plane flies");
			break;
		}
		//demo valueOf(String x) gets the value of an enumeration from a string
		
			System.out.println("The value of \"TRAIN\" is: " + Transport.valueOf("TRAIN"));
		//demo values
		System.out.println("Values of the enumeration: ");	
		for (Transport x:Transport.values()){
			System.out.println(x);
		}
		
	}
}
		
	
		

	


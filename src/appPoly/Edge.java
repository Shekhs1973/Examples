package appPoly;

public class Edge {

	public static int counter = 0 ; 
	
	public Edge(){
		counter = counter +1 ; 
		System.out.println("Created Edge "+counter);
	}

	public static int getCounter(){
		return counter;
	}
}

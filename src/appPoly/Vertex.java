package appPoly;

public class Vertex {
	
	public static int counter = 0 ; 
	
	public Vertex(){
		counter = counter +1 ; 
		System.out.println("Created Vertex "+counter);
	}

	public static int getCounter(){
		return counter;
	}
}

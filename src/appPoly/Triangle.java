package appPoly;

public class Triangle extends Polygon{
	static String polygonType = "Triangle" ; 
	
	
	
	public Triangle(String type){
	
		System.out.println("Polygon Type is : "+polygonType);
		
	}
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
	Polygon triangle1 =  new Triangle(polygonType);
	  
	Vertex vertice1 = new Vertex();
	Vertex vertice2 = new Vertex();
	Vertex vertice3 = new Vertex();
	
	System.out.println("Triangle has "+Vertex.getCounter()+" vertices");
	
	Edge edge1 = new Edge();
	Edge edge2 = new Edge();
	Edge edge3 = new Edge(); 
	
	System.out.println("Triangle has "+Edge.getCounter()+" edges");
	
	}
	
}

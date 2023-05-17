package appPoly;

public abstract class Polygon{
	String polygonType;

	public Polygon(){
		
		System.out.println("Polygon is created ");
		
	}
  
	public Polygon(String type){
		
		System.out.println("Polygon Type is : "+type);
		
	}
}

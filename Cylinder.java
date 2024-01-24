public class Cylinder{
	private double radius;
	private double height;

	public Cylinder(){
		radius = 1;
		height = 1;
	}

	public void setRadius(double radius){
		if(radius<1){
			System.out.println("Enter a Valid radius ");
		}else{ this.radius = radius;}

	}

	public void setHeight(double height){
		if(height<1){
			System.out.println("Enter A Valid height");
			
		}else{this.height = height; }

	}

	public double getHeight(){return height;}

	public double getRadius(){return radius;}

	public double calculateCylinderVolume(){
			double volume = 0;
		if(height>0){
		 volume = Math.PI *(Math.pow(getRadius(),2))*getHeight();	}
		return volume;
	}

}
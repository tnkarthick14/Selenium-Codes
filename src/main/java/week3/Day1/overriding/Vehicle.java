package week3.Day1.overriding;

public class Vehicle {
	
	public void VehicleType() {
		System.out.println("It is a two wheeler");
	}
	public void Country() {
		
		System.out.println("Vehicle is in India");
	}
	
	public static void main(String[] args) {
		//vehicle type
		Vehicle objVehicle = new Vehicle();
		objVehicle.VehicleType();
		
		//Vehicle Country : 
		objVehicle.Country();
		
		//Bike Class : 
		Bike objBike =new Bike();
		objBike.riding();
		
		//Street Rider
		StreetRider ride =new StreetRider();
		ride.Country();
		
		//Mountain Rider 
		MountainRider ride2 = new MountainRider();
		ride2.Country();
		
		
		
		
		
	}

}

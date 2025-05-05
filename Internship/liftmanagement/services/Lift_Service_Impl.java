package liftmanagement.services;
import liftmanagement.entity.*;
import liftmanagement.entity.Lift;
import liftmanagement.Application;

public class Lift_Service_Impl implements Lift_Services{

	@Override
	public void MoveLift(Lift lift) {
		if(!lift.getPendingRequests().isEmpty()) {
		int previous=lift.getCurrentFloor();
		int destination=lift.getPendingRequests().remove(0);
		lift.setCurrentFloor(destination);
		
		if(previous < destination) {
			for(int i=previous;i<=destination;i++) {
				System.out.println("Lift"+lift.getLiftId()+" is on floor number "+i);
			}
		}else if(previous>destination) {
			for(int i=previous;i>=destination;i--) {
				System.out.println("lift"+lift.getLiftId()+"is on floor number"+i);
			}
		}else {
			System.out.println("you are in the same floor");
		}
		//System.out.println(lift.toString());
		}
		
	}

	@Override
	public void MakeRequest(Lift lift,int floor) {
		lift.getPendingRequests().add(floor);
		
		
	}
	@Override
	public  void addRequest(Lift lift,int floor) {
		lift.setPendingRequests(floor);
		System.out.println("request added succesfully");
	}

}

package liftmanagement.services;

import liftmanagement.entity.Lift;

public interface Lift_Services {
	void MoveLift(Lift lift);
	void MakeRequest(Lift lift,int floor);
	void addRequest(Lift lift, int floor);
	
}

package liftmanagement.entity;

import java.util.ArrayList;
import java.util.List;

public class Lift {
	private int liftId;
	private int currentFloor;
	private final int max = 4;
	private final int min = 0;
	private List<Integer> pendingRequests=new ArrayList<>();
	public Lift(int liftId) {
		super();
		this.liftId = liftId;
		this.currentFloor = 0;
//		this.requests = requests;
	}
	public int getLiftId() {
		return liftId;
	}
	public void setLiftId(int liftId) {
		this.liftId = liftId;
	}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public List<Integer> getPendingRequests() {
		return pendingRequests;
	}
	public void setPendingRequests(List<Integer> pendingRequests) {
		this.pendingRequests = pendingRequests;
	}
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
	@Override
	public String toString() {
		return "Lift [liftId=" + liftId + ", currentFloor=" + currentFloor + ", max=" + max + ", min=" + min
				+ ", pendingRequests=" + pendingRequests + "]";
	}
	public void setPendingRequests(int floor) {
		// TODO Auto-generated method stub
		this.pendingRequests.add(floor);
	
	}
	
	
	
}


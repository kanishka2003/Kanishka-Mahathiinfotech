package liftmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import liftmanagement.entity.Lift;
import liftmanagement.services.Lift_Service_Impl;

public class Application {
	private static List<Lift> lifts=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Lift_Service_Impl service=new Lift_Service_Impl();
		
		System.out.println("Welcome to the lift");
		System.out.println("Enter the no of lifts:");

		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			lifts.add(new Lift(i));
		}
		System.out.println("enter  the lift id and floor to make request to lift");
		System.out.println("enter lift id:");
		int id=sc.nextInt();
		System.out.println("enter the floor you need:");
		int floor=sc.nextInt();
		service.addRequest(Application.getLiftById(id),floor);
		//service.addRequest(Application.getLiftById(id),3);
		while(!Application.getLiftById(id).getPendingRequests().isEmpty()) {
			service.MoveLift(Application.getLiftById(id));
		}
		sc.close();
		
	}
	public static Lift getLiftById(int liftId) {
		for(Lift lift:lifts) {
			if(lift.getLiftId()== liftId) {
				return lift;
			}
		}
		return null;
	}
	
}

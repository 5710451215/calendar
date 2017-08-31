package model;

import java.util.ArrayList;

public class Schedule {
	private String date;
	public String description;
	public static Schedule schedule;
	
	private static ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	
	
	
	
	   public static void addSchedule (String date,String description){
		   schedule = new Schedule (date,description);
		   schedules.add(schedule);
			} 
	   
		public String getdata (String pe){
			
				return schedule.toString();
				
	    	}
		
	

	
	public Schedule (String date,String description){
		this.date = date;
		
		this.description = description;
		}
	public String to_String (){
		return date+description;
		}

	public static ArrayList<Schedule> getSchedules() {
		return schedules;
	}

	
	
	
	
	
}

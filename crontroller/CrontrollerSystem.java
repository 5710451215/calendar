package crontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.*;
import view.ResultView;

public class CrontrollerSystem {
	//Schedule data = new Schedule();
	public void startApplication() {
		ResultView frame = new ResultView(this);
		//frame.setProjectName("Aj. Chu Example");
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1100, 400);
		
		}
	public CrontrollerSystem() {
		String output;
		}
	
	
	//public void newSchedule (String name,String description){
		//data.addSchedule(name,description);
		
		//}
	
	//public String getdata (String pe){
		//return data.getdata(pe);
		//}
}

package com.util;
import java.util.Timer;
import java.util.TimerTask;

import com.to.User;


public class TimerUtil {
	
	private static int timeInMinutes = 1;
	
	public static int getTimeInMinutes() {
		return timeInMinutes;
	}

	public static void setTimeInMinutes(int timeInMinutes) {
		TimerUtil.timeInMinutes = timeInMinutes;
	}

public static void main(String[] args) {
	
	User loggedInUser = UserUtil.captureUserDetails();
	
	TimerTask task = new TimerTask() {
	
		@Override
		public void run() {
			SeleniumUtil.initiateBatch();
			
		}
	};
	
	Timer timer = new Timer();
	timer.scheduleAtFixedRate(task, 0, TimerUtil.getTimeInMinutes()*60*1000);
}
}

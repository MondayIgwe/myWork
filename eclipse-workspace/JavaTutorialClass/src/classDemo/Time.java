package classDemo;

public class Time {

	private int hour;
	private int minute;
	private int seconds;
	
	public void setTime(int h, int m, int s)
	{
		hour = ((h >0 && h < 24) ? h : 0); //instead of if statement, use conditional operator
		seconds = ((s > 0 && s < 60) ? s : 0);
	}
	
	public String toMilitary ()
	{
		return String.format("%02d:%02d:%02d", hour, minute, seconds);
	}
	
}

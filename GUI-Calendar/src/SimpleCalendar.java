
public class SimpleCalendar {

	public static void main(String[] args)
	{
		GUI_Calendar_Model calendarModel = new GUI_Calendar_Model();
		GUI_Calendar_View calendarView = new GUI_Calendar_View(calendarModel);
		calendarModel.attach(calendarView);
	}
}

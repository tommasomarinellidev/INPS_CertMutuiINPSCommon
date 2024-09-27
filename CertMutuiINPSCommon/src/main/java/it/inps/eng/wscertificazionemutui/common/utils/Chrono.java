package it.inps.eng.wscertificazionemutui.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Chrono{

	private Calendar start;
	private Calendar end;
	
	public Chrono() {
		start = getCalendarInstance() ;
		end = null;
	}
	
	public String getStartTime() {
		return formatDate(start);
	}
	
	public String getEndTime() {
		return formatDate(getEnd());
	}

	private String formatDate(Calendar calendar) {
		return new SimpleDateFormat("HH:mm:ss").format(calendar.getTime()) ;
	}

	public long getTimeSpent() {
		return getEnd().getTimeInMillis() - start.getTimeInMillis();
	}

	private Calendar getCalendarInstance ( )
	{
		return Calendar.getInstance();
	}
	
	private Calendar getEnd(){
		if(end==null) end = getCalendarInstance();
		return end;
	}
}
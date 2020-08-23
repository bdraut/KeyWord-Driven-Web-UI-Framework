package com.tieto.dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);  // Printig todays date.
		
		SimpleDateFormat sd = new SimpleDateFormat("dd//MM//yyyy");
		SimpleDateFormat sd1 = new SimpleDateFormat("d:MM:yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		System.out.println(sd1.format(d));

	}

}

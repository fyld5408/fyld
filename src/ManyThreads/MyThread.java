package ManyThreads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread{
	private SimpleDateFormat sdf;
	private String dateString;
	public MyThread(SimpleDateFormat sdf,String dateString){
		super();
		this.sdf=sdf;
		this.dateString=dateString;
	}
	public void run(){
		Date dateRef;
		try {
			dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd")
					.parse(dateString);
			String newDateString=DateTools.getSimpleDateFormat("yyyy-MM-dd")
					.format(dateRef).toString();
			if(!newDateString.equals(dateString)){
				System.out.println("wrong");
			}
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}

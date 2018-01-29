package timer;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;


public class TimerTest {
public static void main(String[] args){
	TalkingClock clock=new TalkingClock();
    Class<?> tClass=clock.getClass();
    Field[]  fields=tClass.getFields();
    for (Field field : fields) {
		System.out.println(Modifier.toString(field.getModifiers()));
	}
    
}
}

class TalkingClock{
	public static int i=0;
	
	public void start(int interval,final boolean beep){
		class TimePrinter implements ActionListener{
			
			public void actionPerformed(ActionEvent event){
				Date now= new Date();
				System.out.println("At the tone,the time is "+now);
				if(beep)Toolkit.getDefaultToolkit().beep();
			}
		}
		
		ActionListener listener=new TimePrinter();
		Timer t=new Timer(interval,listener);
		t.start();
	}
}



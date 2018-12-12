package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayBean {
	private String name;
	private SimpleDateFormat f;

	public TodayBean() {
		f = new SimpleDateFormat("yyyy-MM-dd");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String printToday() {
		StringBuffer sb = new StringBuffer();
		sb.append(name).append("´Ô ¿À´Ã ³¯Â¥´Â : ").append(f.format(new Date()));
		return sb.toString();
	}
	
}

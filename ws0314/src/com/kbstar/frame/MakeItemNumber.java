package com.kbstar.frame;

import java.util.Calendar;

public class MakeItemNumber {
	public static int cnt = 100;
	public static int cnt2 = 100;
	public static String makeItemNum() {
		String itemNum = "";
		Calendar cal = Calendar.getInstance();
		itemNum = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cal.get(Calendar.MILLISECOND)
		            + cnt2;
		cnt2++;
		return itemNum;
	}
	public static String makeCartNum() {
		String cartNum = "";
		Calendar cal = Calendar.getInstance();
		cartNum = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cnt;
		cnt++;
		return cartNum;
	}
}

package com.otherapi.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateDemo {
	/**
     * 日期对象和毫秒值之间的转换
     * 
     * 毫秒值 ---> 日期对象: 1.通过Date对象的构造方法 new Date(timeMillis); 
     *                   2.还可以通过setTime 设置。
     * 因为可以通过Date对象的方法对该日期中各个字段（年月日等）进行操作。
     * 
     * 日期对象 ---> 毫秒值 : 1.getTime方法。
     * 
     * 因为可以通过具体的数值进行运算。
     * 
     */
    public static void methodDemo_1() {
        /*
         *  构造方法
         *  date Date();
         *  date Date(long currentTimeMillis);
         */
        
        //currentTimeMillis 方法返回long值
        long time = System.currentTimeMillis();
        System.out.println(time); // 1479044117743
        Date date = new Date();
        System.out.println(date); // Sun Nov 13 21:35:17 CST 2016
        Date date2 = new Date(1479044117743l);
        System.out.println(date2);
    }
    @Test
    public void fmtDate(){
    	Date date = new Date(); 
    	DateFormat dfmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    	String format = dfmt.format(date);
    	System.out.println(format);
    }
    /**
     * 对日期对象进行格式化。 将日期对象 ---> 日期格式的字符串 使用的是DateFormat类中的format方法
     */
    public static void methodDemo_2() {
        Date date = new Date();
        
        // 获取日期格式对象。具备默认风格。
        // 默认风格: 2016-11-13 22:03:21
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        System.out.println("getDateTimeInstance():"+dateFormat.format(date));
        
        // 指定FULL风格 : 2016年11月13日 星期日
        dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("getDateInstance(DateFormat.FULL):"+dateFormat.format(date));
        
        // 指定LONG风格 : 2016年11月13日
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("getDateInstance(DateFormat.LONG):"+dateFormat.format(date));
        
        // 2016-11-13
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("getDateInstance(DateFormat.MEDIUM):"+dateFormat.format(date));
        
        // 16-11-13
        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("getDateInstance(DateFormat.SHORT):"+dateFormat.format(date));
        
        // 2016年11月13日 下午10时06分33秒
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        System.out.println("getDateTimeInstance(DateFormat.LONG, DateFormat.LONG):"+dateFormat.format(date));
        
        // 如果风格是自定义的如何解决呢？
        // 2016--11--13
        dateFormat = new SimpleDateFormat("yyyy--MM--dd");
        String str_date=dateFormat.format(date);
        System.out.println(str_date);
    }
    /**
     * 将日期格式字符串 ---> 日期对象 使用的是DateFormat类中的parse方法
     * 
     * @throws ParseException
     */
    public static void methodDemo_3() throws ParseException {
        // 传入默认日期格式，跟下面的getDateInstance 息息相关。
        String str_date = "2016-4-19";
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date = dateFormat.parse(str_date);
        System.out.println(date);
        
        // 传入LONG日期格式
        str_date = "2016年4月19日";
        dateFormat = DateFormat.getDateInstance(dateFormat.LONG);
        date = dateFormat.parse(str_date);
        
        // 传入自定义日期格式
        str_date = "2016---4---19";
        dateFormat = new SimpleDateFormat("yyyy---MM---dd");
        date = dateFormat.parse(str_date);
        System.out.println(date);
        
    }
}

package com.doit.timer;

import java.util.Timer;
/**
 * Timer对象使用schedule方法，定期执行timertask子类。
 * 参数1：自己实现timertask
 * 参数2：延迟多久执行
 * 参数3：执行间隔是多久
 *
 */
public class timerTest {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new timerTaskextend(), 0, 3*1000);
	}
}

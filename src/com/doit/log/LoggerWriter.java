package com.doit.log;

import org.apache.log4j.Logger;

/**
 * 导入 log4j-1.2.17.jar 包 
 * 在 src下新创建配置文件 log4j.properties 
 * 创建配置文件中指定的日志文件目录
 * 
 */
public class LoggerWriter {

	public static void main(String[] args) throws Exception {
		
		while(true){
			Logger logger = Logger.getLogger("logRollingFile");
			logger.info("111111111111111-----"+System.currentTimeMillis());
			Thread.sleep(50);
			
		}
	}

}

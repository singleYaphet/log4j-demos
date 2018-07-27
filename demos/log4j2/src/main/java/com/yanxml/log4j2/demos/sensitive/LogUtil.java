package com.yanxml.log4j2.demos.sensitive;

import lombok.extern.log4j.Log4j2;

/**日志工具类
 * @author dongp
 *
 */
@Log4j2
public class LogUtil {
	private static final String REGEX = "[\\d]{8,15}";
	private static final String REPLACEMENT = "********";

	public static void main(String[] args) throws InterruptedException {
		// String text = "asdsad13800005001asd";
		String text = "asdsad12345678asd";
		log.info(text);
		//Thread.sleep(100000);
	}

	/**
	 * 定制输出文本
	 * 
	 * @param text
	 * @return
	 */
//	public static String customize(String text) {
//		return text.replaceAll(REGEX, REPLACEMENT);
//
//	}
}

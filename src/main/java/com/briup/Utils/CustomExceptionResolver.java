package com.briup.Utils; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/** 
 * @author yyj 
 * @version CreateTime：2018年4月9日 上午11:02:26 
 * 自定义异常处理器
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, 
			HttpServletResponse response, Object obj,
			Exception e) {
		// obj：包名+类名+方法名（形参） 字符串， 将这些字符串信息记录在日志文件中，方便以后查看，可以使用log4j记录日志文件
		ModelAndView mav = new ModelAndView();
		//判断异常为类型
		if(e instanceof Exception){
			//预期异常
			Exception me = (Exception)e;
			mav.addObject("error", me.getMessage());
		}else{
			mav.addObject("error", "未知异常");
		}
		mav.setViewName("error");
		return mav;
	}
}
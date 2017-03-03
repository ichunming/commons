package com.ichunming.common.util;

import javax.servlet.http.HttpServletRequest;

import com.ichunming.common.helper.SessionInfo;

public class SessionUtil {
	
	private static final String DEFAULT_SESSION_INFO_NAME = "ICHUNMING-SESSION";
	
	private SessionUtil(){}
	
	/**
	 * 取得用户Session
	 * @param request
	 * @return
	 */
	public static SessionInfo getSessionInfo(HttpServletRequest request){
		return (SessionInfo) request.getSession().getAttribute(DEFAULT_SESSION_INFO_NAME);
	}

	public static SessionInfo getSessionInfo(HttpServletRequest request, String sessionName){
		return (SessionInfo) request.getSession().getAttribute(sessionName);
	}
	
	/**
	 * 设置用户Session过期
	 * @param sessionName
	 * @param request
	 */
	public static void setSessionInfoExpired(HttpServletRequest request){
		request.getSession().setAttribute(DEFAULT_SESSION_INFO_NAME, null);
	}
	
	public static void setSessionInfoExpired(HttpServletRequest request, String sessionName){
		request.getSession().setAttribute(sessionName, null);
	}
	
	/**
	 * 设置用户Session
	 * @param sessionInfo
	 * @param request
	 */
	public static void setSessionInfo(Object sessionInfo, HttpServletRequest request){
		request.getSession().setAttribute(DEFAULT_SESSION_INFO_NAME, sessionInfo);
	}
	
	public static void setSessionInfo(Object sessionInfo, HttpServletRequest request, String sessionName){
		request.getSession().setAttribute(sessionName, sessionInfo);
	}
}

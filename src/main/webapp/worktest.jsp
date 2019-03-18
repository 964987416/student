<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" 	import="java.util.HashMap"  import="java.util.ArrayList"
import=" java.util.List" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WorkTest</title>
</head>
<body>	
	<h6>test.jsp</h6><br>
	<%=(page==this)%>
	<!-- jsp页面el表达式（${}） -->
	
	String[] s = {"hello","world"};
	List<String> list = new ArrayList<String>();
	list.add("老范");
	list.add("马飞飞");
	list.add("垃圾"); 
	
	 HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	map.put("1", 123);
	map.put("2",666);
	map.put("我是HashMap", 1);
	
	request.
	setAttribute("str", s);
	request.setAttribute("list",list);
	request.setAttribute("map",map);
	
	${str[0]}<br>
	${list[1]}<br>
	${map["2"]}<br>
	
	
	
	
</body>
</html>
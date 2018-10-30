<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>"> 
    <title>查询影片</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  
  <FORM action="filmInfo/findFilmInfoByChname" Method="post">    
  	影片名称：<Input type=text name="chname" size="7" align="left" maxlength="100">            
    <Input type=submit value="查询" />
  </FORM>
  
  <FORM action="filmInfo/downLoadPosterAndModify" Method="post">    
  	图片文件名称：<Input type=text name="pName" size="7" align="left" maxlength="100">
  	影片文件名称：<Input type=text name="fName" size="7" align="left" maxlength="100">           
            海报地址：<Input type=text name="pUrl" size="7" align="left" maxlength="100">
    <Input type=submit value="提交" />
  </FORM>
  
  <FORM action="filmInfo/downLoadStillsAndModify" Method="post">    
  	图片文件名称：<Input type=text name="pName" size="7" align="left" maxlength="100">
  	影片文件名称：<Input type=text name="fName" size="7" align="left" maxlength="100">           
            剧照地址1：<Input type=text name="sUrl1" size="7" align="left" maxlength="100">
            剧照地址2：<Input type=text name="sUrl2" size="7" align="left" maxlength="100">
            剧照地址3：<Input type=text name="sUrl3" size="7" align="left" maxlength="100">
            剧照地址4：<Input type=text name="sUrl4" size="7" align="left" maxlength="100">
    <Input type=submit value="提交" />
  </FORM>
  
  <body>
  
   <table cellpadding="0" cellspacing="0" border="1" style="word-break:break-all; word-wrap:break-all;">
		<c:forEach items="${listFilmInfoByChname}" var="list" varStatus="i">
			<tr><td width ="70px" height = "20px">影片名称:</td>
			<td width = "1335px" height = "20px">${list.chName }</td></tr>
			
			<tr><td width ="70px" height = "20px">英文名称:</td>
			<td width = "1335px" height = "20px">${list.enName }</td></tr>
			
			<tr><td width ="70px" height = "20px">影片简介:</td>
			<td width = "1335px" height = "20px">${list.onlyDescribe }</td></tr>
			
			<tr><td width ="70px" height = "50px">影片剧情:</td>
			<td width = "1335px" height = "50px">${list.gutdescipty }</td></tr>
			
			<tr><td width ="70px" height = "20px">上映日期:</td>
			<td width = "1335px" height = "20px">${list.fShowTime }</td></tr>
			
			<tr><td width ="70px" height = "20px">影片类型:</td>
			<td width = "1335px" height = "20px">${list.pixType }</td></tr>
			
			<tr><td width ="70px" height = "20px">影片时长:</td>
			<td width = "1335px" height = "20px">${list.pixLength }</td></tr>
			
			<tr><td width ="70px" height = "20px">影片导演:</td>
			<td width = "1335px" height = "20px">${list.filmDirector }</td></tr>
			
			<tr><td width ="70px" height = "20px">影片演员:</td>
			<td width = "1335px" height = "20px">${list.filmActor }</td></tr>
			
			<tr><td width ="70px" height = "20px">制式编码:</td>
			<td width = "1335px" height = "20px">${list.pixNumber }</td></tr>
			
			<tr><td width ="70px" height = "20px">影片制式:</td>
			<td width = "1335px" height = "20px">${list.filmType }</td></tr>					
			
			<tr><td width ="70px" height = "20px">影片语言:</td>
			<td width = "1335px" height = "20px">${list.soundLanguage }</td></tr>
			
			<tr><td width ="70px" height = "20px">制片国家:</td>
			<td width = "1335px" height = "20px">${list.country }</td></tr>
			
			<tr><td width ="70px" height = "20px">海报地址:</td>
			<td width = "1335px" height = "20px">${list.picture }</td></tr>
			
			<tr><td width ="70px" height = "70px">剧照地址:</td>		
			<td width = "1335px" height = "70px"><span>${list.picurl}</span></td>
			</tr>													
		</c:forEach>		
	</table>
  </body>
</html>


	<!--
	<c:if test="${(i.index+1)%2==0}">
	<p>
	</c:if>
	 -->




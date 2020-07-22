<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>增加页面</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
  </head>
  <style type="text/css">
   div{
     width: 500px;
     margin:0 auto
   }
   table{
    width: 500px;
   }
</style>
  <body>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/addUser.js"></script>
   <c:set var="ctx" value="${pageContext.request.contextPath}"/>
    <script type="text/javascript">
    var contextPath = "${ctx}";
   </script>
   <div class="container">
  
     <h4>新增信息</h4>
     <table style="padding-bottom: 20px;">
				<tr>
					<td>姓名: </td>
					<td>
					 <input type="text" class="input-small" placeholder="员工名称" name="name" id="name" value="">
					</td>
				</tr>
				<tr>
				<td>部门: </td>
				  <td><select name="d_name" id="d_name">
					
				  <option value="0">--请选择--</option>
				  
				   <c:forEach var="getDepartmentlist" items="${getDepartmentlist}">
	    <option value="${getDepartmentlist.d_id}" ${d_id==getDepartmentlist.d_id ?'selected':''}>${getDepartmentlist.d_name} </option> 
				   </c:forEach>
				  
					
					</select></td>
				</tr>
				<tr>
					<td>地址: </td>
					<td>
					 <input type="text" class="input-small" placeholder="地址" name="address" id="address" value="">
					</td>
				</tr>
				<tr>
					<td>权限: </td>
					<td>
					 <input type="text" class="input-small" placeholder="权限" name="role" id="role" value="">
					</td>
				</tr>
			</table>
           
			 <input class="btn btn-primary" type="button" onclick="addUser()" value="增加"/>
			 <a href="${ctx}/index" class="btn btn-primary">返回</a>
  </div>
  
  </body>
</html>


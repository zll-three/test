<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <title>主页</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
 <style type="text/css">
   div{
     width: 500px;
     margin:0 auto
   }
   table{
    width: 500px;
   }
</style>
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/delUser.js"></script>
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
    <script type="text/javascript">
    var contextPath = "${ctx}";
   </script>
   <div>
      <form action="${pageContext.request.contextPath}/index" method="post">
  <div class="form-group">
    <label for="exampleInputtest">员工名称</label>
    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="员工名称" name="userName">
  </div>
  <div class="form-group">
           <label for="test">部门</label>
              <select class="form-control" name="d_id">  
					<option value="0" selected='selected'>--请选择--</option>
				    <c:forEach var="getDepartmentlist" items="${getDepartmentlist}"> 
				    <option value="${getDepartmentlist.d_id}" ${d_id==getDepartmentlist.d_id ?'selected':''}>${getDepartmentlist.d_name}</option> 
					</c:forEach>
  </select>
    </div>
  
  <button type="submit" class="btn btn-default">提交</button>
  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
  <a class="btn btn-primary" href="${pageContext.request.contextPath}/add">增加用户</a>
</form> 
<br>
  <div>
      <c:forEach var="getDepartmentList" items="${getDepartmentList}" varStatus="status">
       <table class="table table-bordered">
      <tr><td>部门:${getDepartmentList.d_name}</td><td>操作</td></tr>    
       <c:forEach var="userList" items="${getDepartmentList.userList}" varStatus="status">
       
        
        <tr><td>姓名:${userList.userName}&nbsp;&nbsp;&nbsp;&nbsp;地址:${userList.address}&nbsp;&nbsp;&nbsp;&nbsp;角色:${userList.role}</td>
        <td>
        <a href="javascript:;" onclick="delUser(${userList.u_id})">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="${pageContext.request.contextPath}/up/${userList.u_id}">修改</a>   
        </td></tr>
       
       
          </c:forEach> 
     </table>  
           
         </c:forEach>
         </div>
    </div>
    
  
  </body>
</html>



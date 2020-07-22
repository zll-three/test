function upUser(id) {
	var name = $("#name").val();
	var d_name = $("#d_name").val();
	var address = $("#address").val();
	var role = $("#role").val();
	if (name == "") {
		alert("姓名不能为空");
		return false;
	}
	else if (d_name == 0) {
		alert("请选择部门");
		return false;
	}
	else if (address == "") {
		alert("地址不能为空");
		return false;
	}
	
	else if (role == "") {
		alert("权限不能为空");
		return false;
	}
	$.ajax({
		"url" : contextPath+"/upUser",
		"type" : "post",
		"data" :{userName:name,d_name:d_name,address:address,role:role,u_id:id}, 
		"dataType" : "json",
		"success" : success,
		"error" : error,
	});
	
	// 修改成功回调函数
	function success(data) {
		if(data.upUserResult == "true"){
			alert("修改成功");
          location.href = contextPath+"/index";
		}else if(data.upUserResult == "false"){
			$("#ts").html("<font>修改失败</font>");
		}
	}
	//请求失败回调函数
	function error(date) {
		alert("请求失败!");
	}
}
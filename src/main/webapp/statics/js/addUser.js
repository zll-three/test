function addUser() {
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
		"url" : contextPath+"/addUser",
		"type" : "post",
		"data" : {userName:name,d_name:d_name,address:address,role:role},
		"dataType" : "json",
		"success" : success,
		"error" : error,
	});
	
	// 增加成功回调函数
	function success(data) {
		if(data.addUserResult == "true"){
			alert("添加成功");
          location.href = contextPath+"/index";
		}else if(data.addUserResult == "false"){
			$("#ts").html("<font>添加失败</font>");
		}
	}
	//请求失败回调函数
	function error(date) {
		alert("请求失败!");
	}
}
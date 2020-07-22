package com.zll.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.zll.pojo.Department;
import com.zll.pojo.User;
import com.zll.service.DepartmentService;
import com.zll.service.UserService;

@Controller
public class UserController {
     @Resource
	private UserService userService;
     @Resource
     private DepartmentService departmentService;
     //主页信息
     @RequestMapping({"/index","/"})
     public String index(Model model,@RequestParam(value = "userName",required = false)String userName, 
    		                        @RequestParam(value = "d_id",required = false) String d_id) {
    	 int id=0;
    if(d_id!=null) {
    	 id=Integer.parseInt(d_id);
    }

    	 List<User> getUserList=userService.getUserList();
    	 List<Department> getDepartmentList=departmentService.getDepartmentList(userName,id);
    	 List<Department> getDepartmentlist=departmentService.getDepartmentlist();
    	 model.addAttribute("getUserList", getUserList);
    	 model.addAttribute("getDepartmentList", getDepartmentList);
    	 model.addAttribute("getDepartmentlist", getDepartmentlist);
    	 
    	 return "index";
     }
     //解除
    @RequestMapping("/delUser")
  	@ResponseBody
  	public Object delUser(@RequestParam(value = "id", required = false) String id) {
  		HashMap<String, String> resultMap = new HashMap<String, String>();
  		System.out.println(id);
  		int count=userService.delUd(Integer.parseInt(id));
  		if(count>0) {
  			resultMap.put("delUserResult", "true");

  		} else {
  			resultMap.put("delUserResult", "false");
  		}
  		return JSONArray.toJSONString(resultMap);
  		
  	}
  //增加
    @RequestMapping("/addUser")
 	@ResponseBody
 	public Object addUser(User user,@RequestParam(value = "d_name",required = false) String d_name) {
 		HashMap<String, String> resultMap = new HashMap<String, String>();
 		int count =userService.addUser(user);
 		int num=userService.addUd(user.getU_id(),Integer.parseInt(d_name));
 		if(count>0&&num>0) {
 			resultMap.put("addUserResult", "true");

 		} else {
 			resultMap.put("addUserResult", "false");
 		}
 		return JSONArray.toJSONString(resultMap);
 		
 	}
  //增加
    @RequestMapping("/upUser")
 	@ResponseBody
 	public Object upUser(User user,@RequestParam(value = "d_name",required = false) String d_name,
 			@RequestParam(value = "u_id",required = false) String u_id) {
 		HashMap<String, String> resultMap = new HashMap<String, String>();
 		int count =userService.upUser(user);
 		int num=userService.upUd(Integer.parseInt(u_id), Integer.parseInt(d_name));
 		if(count>0&&num>0) {
 			resultMap.put("upUserResult", "true");

 		} else {
 			resultMap.put("upUserResult", "false");
 		}
 		return JSONArray.toJSONString(resultMap);
 		
 	}
     //修改用户跳转
   @RequestMapping("/up/{u_id}")
   public String up(Model model,@PathVariable("u_id") String u_id) {
	   List<User> getUserlist=userService.getUserList(Integer.parseInt(u_id));
	   List<Department> getDepartmentlist=departmentService.getDepartmentlist();
  	   model.addAttribute("getDepartmentlist", getDepartmentlist);
	   model.addAttribute("getUserlist", getUserlist);
	   
	return "upUser";
	   
	   
   }
     
     //跳转增加页面
     @RequestMapping("/add")
  	public String add(Model model) {
  		
    	 List<Department> getDepartmentlist=departmentService.getDepartmentlist();
    	 model.addAttribute("getDepartmentlist", getDepartmentlist);
 		 return "addUser";
  		
  	
  	}
}

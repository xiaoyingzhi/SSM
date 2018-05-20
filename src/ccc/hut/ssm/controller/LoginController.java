package ccc.hut.ssm.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ccc.hut.ssm.po.User;
import ccc.hut.ssm.po.UserExample;
import ccc.hut.ssm.service.LoginService;
/**
 * @ClassName:      LoginController
 * @Description:    TODO
 * @author:         Khan
 * @date:           2018年5月20日		上午11:44:35
 */
@Controller()
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	// 登陆
	@RequestMapping("/login")
	public String login(HttpSession session, String username,int password)
			throws Exception {

		// 调用service进行用户身份验证
		// ...
		int count=loginService.findUser(username,password);
		if(count>0){
			return "success";
		}
//		// 在session中保存用户身份信息
//		session.setAttribute("user", user);
		// 重定向到商品列表页面
		return "error";
	}
	
	
}

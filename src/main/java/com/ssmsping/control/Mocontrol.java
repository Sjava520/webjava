package com.ssmsping.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssmsping.dao.Mobiledao;
import com.ssmsping.pojo.Mobilepojo;

@Controller
public class Mocontrol {
	@Resource
	Mobiledao mobiledao;
String msg;
	public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
	@RequestMapping("/mocontrol")
	public String select(Model model, Mobilepojo mobilepojo) {
		int i = 9 - 8;
		int k = 8;
		String MobileNumber = mobilepojo.getMobileNumber();
		System.out.println(i);
		Mobilepojo pojo = mobiledao.selectByNum(MobileNumber.substring(0, 7));
		System.out.println(k);
		String pojo1 = pojo.getMobileArea();
		System.out.println(pojo1);
		model.addAttribute("msg", pojo1);
		return "succ";
	}
}

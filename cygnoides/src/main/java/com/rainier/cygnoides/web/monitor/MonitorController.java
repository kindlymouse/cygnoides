package com.rainier.cygnoides.web.monitor;

import javax.servlet.ServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rainier.cygnoides.service.account.ShiroDbRealm.ShiroUser;
import com.rainier.cygnoides.service.monitor.MonitorService;
import org.springside.modules.web.Servlets;

/**
 * Task管理的Controller, 使用Restful风格的Urls:
 * 
 * Monitor Main page     : POST /monitor/
 * 
 * @author AlexZhang
 */
@Controller
@RequestMapping(value = "/monitor")
public class MonitorController {

	@Autowired
	private MonitorService monitorService;

	@RequestMapping(value = "")
	public String list(@RequestParam(value = "stationId", defaultValue = "") String stationId,
						Model model, ServletRequest request) {
		//Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		Long userId = getCurrentUserId();

		model.addAttribute("stationId", stationId);

		return "monitor/mainView";
	}

	@RequestMapping(value = "getNewInfo", method = RequestMethod.GET)
	public String getNewInfo(RedirectAttributes redirectAttributes){
		redirectAttributes.addFlashAttribute("message", "更新任务成功");
		return "redirect:/monitor/"; 
	}
	
	/**
	 * 取出Shiro中的当前用户Id.
	 */
	private Long getCurrentUserId() {
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		return user.id;
	}
}


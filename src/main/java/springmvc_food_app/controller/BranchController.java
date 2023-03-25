package springmvc_food_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import springmvc_food_app.dao.BranchDao;
import springmvc_food_app.dao.UserDao;
import springmvc_food_app.dto.Branch;
import springmvc_food_app.dto.User;

@Controller
public class BranchController {
	@Autowired
	private BranchDao dao;
	
	@Autowired
	private UserDao userDao;
     
	@RequestMapping("/createbranch")
	public ModelAndView create() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("branch", new Branch());
		modelAndView.setViewName("createbranch.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/savebranch")
	public ModelAndView save(@ModelAttribute Branch branch) {
		ModelAndView modelAndView=new ModelAndView();
		  User user= userDao.getAdmin("admin");
		  dao.saveBranch(branch,user);
		  List<Branch> list=dao.getAllBranch();
		modelAndView.addObject("list",list);
		modelAndView.setViewName("adminhome.jsp");
		return modelAndView;
		
	}
	
	@RequestMapping("/displaybranch")
	public ModelAndView displaybranch() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("branch", new Branch());
		modelAndView.setViewName("displaybranch.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/branchdisplay")
	public ModelAndView branchdisplay(@ModelAttribute Branch branch) {
		ModelAndView modelAndView=new ModelAndView();
		 List<Branch> list=dao.getAllBranch();
		modelAndView.addObject("list",list);
		modelAndView.setViewName("displaybranch.jsp");
		return modelAndView;
		
	}
	
	@RequestMapping("/edit")
	public ModelAndView editbranch(@RequestParam int id) {
		ModelAndView modelAndView=new ModelAndView();
		  Branch branch=dao.getBranchById(id);
		  modelAndView.addObject(branch);
		  modelAndView.setViewName("edit.jsp");
		  return modelAndView;
		  
	}
	
	@RequestMapping("/update")
	public ModelAndView update(@ModelAttribute Branch branch) {
		  ModelAndView modelAndView=new ModelAndView();
		  dao.updateBranch(branch);
		  List<Branch> list = dao.getAllBranch();
			 modelAndView.addObject("list", list);
			 modelAndView.setViewName("displaybranch.jsp");
			 return modelAndView;
	}
	

}

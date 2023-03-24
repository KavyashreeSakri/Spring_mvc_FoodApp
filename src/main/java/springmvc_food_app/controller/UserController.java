package springmvc_food_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc_food_app.dao.UserDao;
import springmvc_food_app.dto.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/signup")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("signup.jsp");
		return modelAndView;
	}

	@RequestMapping("/saveUser")
	public ModelAndView save(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		userDao.saveUser(user);
		modelAndView.setViewName("home.jsp");
		return modelAndView;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("login.jsp");
		return modelAndView;

	}

	@RequestMapping("/loginUser")
	public ModelAndView loginUser(@ModelAttribute User user ) {
		ModelAndView modelAndView = new ModelAndView();
		User user2 = userDao.getUserByEmail(user.getEmail());
		if (user.getEmail().equals(user.getEmail()) && user.getPassword().equals(user.getPassword())) {
			if (user2.getRole().equals("Manager")) {
				modelAndView.setViewName("menu.jsp");
			} else if (user2.getRole().equals("Staff")) {
				modelAndView.setViewName("displaymenu.jsp");
			} else if (user2.getRole().equals("Admin")) {
				modelAndView.setViewName("adminhome.jsp");
			}
		} else
			modelAndView.setViewName("home.jsp");

		return modelAndView;
	}

}

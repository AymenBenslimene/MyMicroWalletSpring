package tn.esprit.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.service.IUserService;

@Controller
public class UserControlImpl {
	@Autowired
	IUserService userService;
}

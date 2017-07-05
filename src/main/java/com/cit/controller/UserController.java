
package com.cit.controller;





import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cit.model.User;
import com.cit.service.UserService;


@Controller
@RequestMapping(value="User")
public class UserController {
	
	private static  Logger LOGGER = Logger.getLogger(UserController.class.getName());

    @Autowired
    public UserService userservice;
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {

            System.out.println("Controller called");    
        return "Register";
    }

    

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public String addUser(@RequestParam("id") int id,@RequestParam("username") String username,
            @RequestParam("password") String password, @RequestParam("mobileno") long mobileno,@RequestParam("emailid")
      String emailid, @RequestParam("active") String active,@RequestParam("role") String role ) {
        
        User user = new User(id,username,password, emailid,mobileno,active,role);
        System.out.println("Inside the controller");
        userservice.save(user);
        return "loginuser";
        

}
    
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login()
    {
        System.out.println("login controller called");
        return "loginuser";
    }
    
    
        
    
    @RequestMapping(value = "/addlogin",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap modelMap, HttpSession session )
    {
        
        
        System.out.println("controller logged in");
        LOGGER.info("Entering Login" +username +"-"+password);
        LOGGER.debug( new Object[] {username,password});
        
        User user = userservice.login(username,password);
        LOGGER.info("User:"+ username);
        
        
        if(user !=null){
            session.setAttribute("Logged in user",user);
            System.out.println(" LOGGED_IN_USER");
            return "redirect:../Book";
            
            }
        else{
           System.out.println("failure");
        }
            return "User/login";
        }
        
    }
	
	


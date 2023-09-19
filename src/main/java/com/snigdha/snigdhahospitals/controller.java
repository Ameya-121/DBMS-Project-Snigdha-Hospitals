package com.snigdha.snigdhahospitals;

// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.ModelAndView;
// import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;

@RestController
public class controller {
    

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }


    @RequestMapping("/doctors")
    public ModelAndView doctors(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("doctors");
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/signup")
    public ModelAndView signup(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("signup");
        return mv;
    }

    @RequestMapping("/appointments")
    public ModelAndView appointments(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("appointments");
        return mv;
    }

    @RequestMapping("/contactus")
    public ModelAndView contactus(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("contactus");
        return mv;
    }

    @RequestMapping("/grievance")
    public ModelAndView grievance(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("grievance");
        return mv;
    }

    


    
    
}

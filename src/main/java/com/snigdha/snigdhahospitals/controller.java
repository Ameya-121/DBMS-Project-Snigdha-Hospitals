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

    
    
}

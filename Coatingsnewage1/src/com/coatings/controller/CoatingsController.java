package com.coatings.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CoatingsController
{

	@Autowired(required = true)
	
	@RequestMapping("/home")
	 public ModelAndView home() 
	{
	  return new ModelAndView("home");
	 }
	@RequestMapping("/news")  
    public ModelAndView news(){  
        return new ModelAndView("news");  
    }  
	@RequestMapping("/insights")  
    public ModelAndView insights(){  
        return new ModelAndView("insights");  
    }  
	@RequestMapping("/coatingtv")  
    public ModelAndView coatingtv(){  
        return new ModelAndView("coatingtv");  
    }  
	@RequestMapping("/interviews")  
    public ModelAndView interviews(){  
        return new ModelAndView("interviews");  
    }  
	@RequestMapping("/events")  
    public ModelAndView events(){  
        return new ModelAndView("events");  
    }  
	@RequestMapping("/product")  
    public ModelAndView product(){  
        return new ModelAndView("product");  
    }  
	@RequestMapping("/RD")  
    public ModelAndView RD(){  
        return new ModelAndView("RD");  
    }  
	@RequestMapping("/video")  
    public ModelAndView video(){  
        return new ModelAndView("video");  
    }  

}

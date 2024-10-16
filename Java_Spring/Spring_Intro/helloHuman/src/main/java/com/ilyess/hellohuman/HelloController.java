package com.ilyess.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 @RequestMapping("/")
	    public String hello(
	        @RequestParam(value = "name", required = false, defaultValue = "human") String Name,
	        @RequestParam(value = "last_name", required = false) String lastName,
	        @RequestParam(value = "times", required = false, defaultValue = "1") int times
	    ) {
	        String greeting;
	        if (lastName != null) {
	            greeting = "Hello " + Name + " " + lastName;
	        } else {
	            greeting = "Hello " + Name;
	        }
	        
	        String result = greeting;
	        for (int i = 1; i < times; i++) {
	            result += " " + greeting;
	        }
	        
	        return result;
	    }

}

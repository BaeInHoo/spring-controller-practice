package com.example.springadminpage.controller;

import com.example.springadminpage.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest() {
        return "Hi getMethod";
    }

    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        System.out.println("id : " + id);
        System.out.println("password : " + pwd);

        return id+pwd;
    }

    @GetMapping("/getMultiParameter")
    public String getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return "OK";
    }

}

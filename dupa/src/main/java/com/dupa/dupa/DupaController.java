package com.dupa.dupa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DupaController {

    @Autowired
    private DupaService dupaService;

    @GetMapping("/chuj")
    @ResponseBody
    public Dao sayChuj() {
        return dupaService.createJSON();
    }

}

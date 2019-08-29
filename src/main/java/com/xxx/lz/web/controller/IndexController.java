package com.xxx.lz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lizhi
 * @date 2018-7-5
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    String index() {

        return "chiji/index";
    }


}

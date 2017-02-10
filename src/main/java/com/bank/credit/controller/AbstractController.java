package com.bank.credit.controller;

import com.bank.credit.model.AppSessionData;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AbstractController {

    protected AppSessionData datosDeSession(HttpServletRequest request){
        AppSessionData app = (AppSessionData) request.getSession().getAttribute("datosEnSession");
        return app;
    }

}

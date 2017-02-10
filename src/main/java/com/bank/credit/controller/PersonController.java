package com.bank.credit.controller;

import com.bank.credit.model.GeneralResponse;
import com.bank.credit.model.bean.PersonaBean;
import com.bank.credit.service.PersonaService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController extends AbstractController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value="/getListPersons.htm", method = RequestMethod.GET)
    @ResponseBody
    public String getListPersons(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Gson gson = new Gson();
        GeneralResponse generalResponse = new GeneralResponse();
        String jsonData;
        try {

            List<PersonaBean> list = personaService.listPersonActive(false);
            long count = list.size();
            generalResponse.setSuccess(true);
            generalResponse.setMessage("");
            generalResponse.setTotalCount(count);
            generalResponse.setData(list);

        } catch (Exception e){
            generalResponse.setSuccess(false);
            generalResponse.setMessage(e.getMessage());
            generalResponse.setTotalCount(0L);
            generalResponse.setData(null);
        } finally {
            jsonData = gson.toJson(generalResponse);
        }

        return jsonData;
    }

    @RequestMapping(value="/listPersonActive.htm", method = RequestMethod.GET)
    @ResponseBody
    public String listPersonActive(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Gson gson = new Gson();
        GeneralResponse generalResponse = new GeneralResponse();
        String jsonData;
        try {

            List<PersonaBean> list = personaService.listPersonActive(true);
            long count = list.size();
            generalResponse.setSuccess(true);
            generalResponse.setMessage("");
            generalResponse.setTotalCount(count);
            generalResponse.setData(list);

        } catch (Exception e){
            generalResponse.setSuccess(false);
            generalResponse.setMessage(e.getMessage());
            generalResponse.setTotalCount(0L);
            generalResponse.setData(null);
        } finally {
            jsonData = gson.toJson(generalResponse);
        }

        return jsonData;
    }

    @RequestMapping(value="/createPersona.htm", method = RequestMethod.POST)
    @ResponseBody
    public String createPersona(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Gson gson = new Gson();
        GeneralResponse generalResponse = new GeneralResponse();
        String jsonData;
        try {

            List<PersonaBean> list = personaService.listPersonActive(true);
            long count = list.size();
            generalResponse.setSuccess(true);
            generalResponse.setMessage("");
            generalResponse.setTotalCount(count);
            generalResponse.setData(list);

        } catch (Exception e){
            generalResponse.setSuccess(false);
            generalResponse.setMessage(e.getMessage());
            generalResponse.setTotalCount(0L);
            generalResponse.setData(null);
        } finally {
            jsonData = gson.toJson(generalResponse);
        }

        return jsonData;
    }

    @RequestMapping(value="/updatePersona.htm", method = RequestMethod.POST)
    @ResponseBody
    public String updatePersona(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Gson gson = new Gson();
        GeneralResponse generalResponse = new GeneralResponse();
        String jsonData;
        try {

            List<PersonaBean> list = personaService.listPersonActive(true);
            long count = list.size();
            generalResponse.setSuccess(true);
            generalResponse.setMessage("");
            generalResponse.setTotalCount(count);
            generalResponse.setData(list);

        } catch (Exception e){
            generalResponse.setSuccess(false);
            generalResponse.setMessage(e.getMessage());
            generalResponse.setTotalCount(0L);
            generalResponse.setData(null);
        } finally {
            jsonData = gson.toJson(generalResponse);
        }

        return jsonData;
    }

    @RequestMapping(value="/deletePersona.htm", method = RequestMethod.POST)
    @ResponseBody
    public String deletePersona(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String numeroDni = request.getParameter("numeroDni");
        Gson gson = new Gson();
        GeneralResponse generalResponse = new GeneralResponse();
        String jsonData;
        try {

            List<PersonaBean> list = personaService.listPersonActive(true);
            long count = list.size();
            generalResponse.setSuccess(true);
            generalResponse.setMessage("");
            generalResponse.setTotalCount(count);
            generalResponse.setData(list);

        } catch (Exception e){
            generalResponse.setSuccess(false);
            generalResponse.setMessage(e.getMessage());
            generalResponse.setTotalCount(0L);
            generalResponse.setData(null);
        } finally {
            jsonData = gson.toJson(generalResponse);
        }

        return jsonData;
    }

    @RequestMapping(value="/loadGridPersonsDefault.htm", method = RequestMethod.GET)
    @ResponseBody
    public String loadGridPersonsDefault(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Gson gson = new Gson();
        GeneralResponse generalResponse = new GeneralResponse();
        String jsonData;
        try {

            List<PersonaBean> list = personaService.listPersonActive(true);
            long count = list.size();
            generalResponse.setSuccess(true);
            generalResponse.setMessage("");
            generalResponse.setTotalCount(count);
            generalResponse.setData(list);

        } catch (Exception e){
            generalResponse.setSuccess(false);
            generalResponse.setMessage(e.getMessage());
            generalResponse.setTotalCount(0L);
            generalResponse.setData(null);
        } finally {
            jsonData = gson.toJson(generalResponse);
        }

        return jsonData;
    }

}

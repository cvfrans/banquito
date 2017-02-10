package com.bank.credit.controller;

import com.bank.credit.model.AppSessionData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PrincipalController extends AbstractController{

	@Autowired
	Environment environment;

	@RequestMapping(value="/main.htm", method = RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String datos = environment.getProperty("app.datos");
		ModelAndView view = new ModelAndView("Main");

		view.addObject("razonSocial", "eCredits SAC");
		view.addObject("usuario", "Harry Potter");
		view.addObject("numeroMensajes", 14);
		view.addObject("empresa", "eCredit");

		AppSessionData app = new AppSessionData();
		app.setEmpresa("eCredit");
		app.setUsuario("Harry Potter");
		app.setRazonSocial("eCredits SAC");
		app.setNumeroMensajes(14);

		// subir datos a session
		request.getSession().setAttribute("datosEnSession", app);

		return view;
	}


	@RequestMapping(value="/getAttributesToSession.htm", method = RequestMethod.GET)
	@ResponseBody
	public String getAttributesToSession(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		JsonObject jsonObject = new JsonObject();
		//HttpSession session = request.getSession(false);
		Gson gson = new Gson();
		String jsonData;
		try {
			jsonObject.addProperty("success", true);
			jsonObject.addProperty("responseText", "responseText");
			jsonObject.addProperty("descriptionAgency", "Ayacucho");
			jsonObject.addProperty("username", "Yeny");
			jsonObject.addProperty("descriptionRole", "Prestamista");

			jsonObject.addProperty("responseText", "responseText");
			jsonObject.addProperty("fullName", "Yeny Canales.");
			jsonObject.addProperty("category", "COLABORADOR.");

			jsonObject.addProperty("pending", "0");
			jsonObject.addProperty("process", "21");




		} catch (Exception e){
			e.getMessage();
			jsonObject.addProperty("mensaje", e.getMessage());
		} finally {
			jsonData = gson.toJson(jsonObject);
		}

		return jsonData;
	}

}
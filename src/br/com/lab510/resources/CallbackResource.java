package br.com.lab510.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.lab510.email.EmailService;
import br.com.lab510.manipulator.XmlFile;
import br.com.lab510.models.Request;


@Path("webhooks")
public class CallbackResource {
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public static Response getContent (@HeaderParam("Content-Type") String contentType, String content) {
		Request request = XmlFile.toObject(content);
		
		StringBuilder event = new StringBuilder();
		event.append("Header: " + contentType);
		event.append(request.toString());
		
		String template = EmailService.getTemplateEmail().replace("{#conteudo}", event);
		EmailService.sendEmail(template, "smart@maxipago.com", "Você recebeu um novo evento de notificação");
	
	return Response.ok().entity(new Gson().toJson(XmlFile.toObject(content))).build();
	
	}	
}

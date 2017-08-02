package com.starfish.catcenter.web.restapi;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestApiController {

	@RequestMapping(value = "/restapi/catCommonService/{version}", method = {
			RequestMethod.GET, RequestMethod.POST })
	public void assisDeterminalService(HttpServletRequest request,
			HttpServletResponse response, @PathVariable String version)
			throws Exception {
		System.out.println(version + "12345");

		String result = "12345";
		response.setContentLength(result.getBytes().length);

		OutputStream os = response.getOutputStream();
		os.write(result.getBytes());
		os.flush();

	}

}
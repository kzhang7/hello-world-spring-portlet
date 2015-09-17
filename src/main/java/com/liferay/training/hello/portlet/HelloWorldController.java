package com.liferay.training.hello.portlet;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("VIEW")
	@RenderMapping
	public String view(RenderRequest request, RenderResponse response) {

		return "view";
	}

	@RequestMapping("HELP")
	@RenderMapping
	public String help(RenderRequest request, RenderResponse response) {
		return "help";
	}
}

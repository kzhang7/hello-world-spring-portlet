package com.liferay.training.hello.portlet;

import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletMode;
import javax.portlet.PortletModeException;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("EDIT")
public class HelloWorldEditController {
	@RenderMapping
	public String edit(RenderRequest request, RenderResponse response) {
		return "edit";
	}

	@ActionMapping
	public void editAction(ActionRequest request, ActionResponse response)
			throws PortletModeException, ValidatorException, IOException,
			ReadOnlyException {

		PortletPreferences portletPreferences = request.getPreferences();
		String name = ParamUtil.getString(request, "name", "");

		portletPreferences.setValue("name", name);
		portletPreferences.store();

		response.setPortletMode(PortletMode.VIEW);
	}
}

package controllers;

import play.data.validation.Required;
import play.mvc.Controller;

public class LoginController extends Controller {

	public static void doLogin(@Required String username,
			@Required String password) {

		validation.required(username);
		validation.required(password);

		if (validation.hasErrors()) {
			Application.login();
		} else {
			Application.index();
		}
	}
}

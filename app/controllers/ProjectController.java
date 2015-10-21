package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.common.head_section;
import views.html.common.main;
import views.html.*;

public class ProjectController extends Controller{

	public Result home(){
		return ok(main.render(home.render(),head_section.render("YEAHH!")));
	}
	
	public Result register(){
		Form<User> aUserForm = Form.form(User.class);
		return ok();
	}
	
	public Result addNewUser(User user){
		return TODO;
	}
}

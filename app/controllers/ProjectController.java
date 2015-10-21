package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class ProjectController extends Controller{

	public Result home(){
		return ok(views.html.home.render("Hello"));
	}
	
	public Result register(){
		Form<User> aUserForm = Form.form(User.class);
		return ok();
	}
	
	public Result addNewUser(User user){
		return TODO;
	}
}

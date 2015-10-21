package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

import play.data.validation.Constraints.Required;

@Entity
public class User extends Model{
	
	@Required
	public String email;
}

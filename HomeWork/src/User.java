package src;

import src.save.Persister;

public class User extends UserAbstract{

	public User(String name) {
		super(name);
	}

	public String getName(){
		return super.name;
	}

}
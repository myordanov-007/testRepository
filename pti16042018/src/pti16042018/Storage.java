package pti16042018;

import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Storage {
	@XmlElement(name = "user")
	private ArrayList<User> bookList;
	private String name;
	private String lname;
    private String email;
    private String pass;
	private String repass;
    
    public void setBookList(ArrayList<User> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<User> getBooksList() {
        return bookList;
    }

	/*
	private ArrayList<User> usersList = new ArrayList<>();
	
	public HashMap<String , User> getUsersList(){
		HashMap<String,User> usersMap = new HashMap<>();
		for(User u: usersList) {
			usersMap.put(u.getName(), u);
		}
		return usersMap;
		
	}
	
	public void setUsersList(User u) {
		this.usersList.add(u);
	}
	
	public ArrayList<User> getUsers(){
		return this.usersList;
	}*/
	
}


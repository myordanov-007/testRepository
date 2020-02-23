package pti16042018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.bind.*;

public class UserStorage {
	/*static void addUser(String n, String e, String p) throws JAXBException, FileNotFoundException{
		File xml = new File("C:\\Users\\ACER\\eclipse-workspace1\\NewProject\\WebContent\\info.xml");
		Storage s;
		JAXBContext context = JAXBContext.newInstance(Storage.class);
		User user = new User();
		user.setName(n);
		user.setPass(p);
		user.setEmail(e);
		
		if(xml.exists()) {
			Unmarshaller u = context.createUnmarshaller();
			s = (Storage)u.unmarshal(xml);
		}else {
			s = new Storage();
		}
		
		HashMap<String,User> usersMap = s.getUsersList();
		if( usersMap.get(n)==null) {
		s.setUsersList(user);
		}else {
			  System.out.println("This username already exist");
			  
		}
		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(s, xml);
		
		
	}
	
	public static  User findUser(String username,String password) throws JAXBException {
		File xml = new File("C:\\Users\\ACER\\eclipse-workspace1\\NewProject\\WebContent\\info.xml");
		if(xml.exists()) {
			JAXBContext context = JAXBContext.newInstance(Storage.class);
			Unmarshaller u = context.createUnmarshaller();
			Storage s = (Storage)u.unmarshal(xml);
			HashMap<String,User> usersMap = s.getUsersList();
			User user = usersMap.get(username);
			if(user!=null && user.getPass().equals(password)) {
				return user;
			}	
		}
		return null;
	}
	
	
	void addUser(User newUser) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(newUser, System.out);
			jaxbMarshaller.marshal(newUser, new File("C:\\Users\\ACER\\eclipse-workspace1\\NewProject\\WebContent\\info.xml"));
		} catch(JAXBException e) {
			e.printStackTrace();
		}
	}*/
	public void addUser(String n, String l, String e, String p, String r) throws JAXBException, IOException {
		final String USERSTORAGE_XML = "D:\\JAVA TU VARNA\\pti16042018\\WebContent\\info.xml";
		
		ArrayList<User> userList = new ArrayList<User>();
		User newUser = new User();
		newUser.setName(n);
		newUser.setLName(l);
		newUser.setEmail(e);
		newUser.setPass(p);
		newUser.setRePass(r);
		userList.add(newUser);
		
		Storage userStorage = new Storage();
		userStorage.setBookList(userList);
		
		JAXBContext context = JAXBContext.newInstance(Storage.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
        m.marshal(userStorage, System.out);
        m.marshal(userStorage, new File(USERSTORAGE_XML));
        
        System.out.println();
        System.out.println("Output from our XML File: ");
        Unmarshaller um = context.createUnmarshaller();
        Storage bookstore2 = (Storage) um.unmarshal(new FileReader(
                USERSTORAGE_XML));
        ArrayList<User> list = bookstore2.getBooksList();
        for (User user : list) {
            System.out.println("Name: " + user.getName() + " |Last name: " + user.getLName() + " |E-mail: " + user.getEmail() + " |Password: " + user.getPass() + " |Repassword: " + user.getRePass());
        }
	}
	/*
	static UserStorage Load() {
		
		return null;
	}
	
	void Save() {
		
	}*/
}

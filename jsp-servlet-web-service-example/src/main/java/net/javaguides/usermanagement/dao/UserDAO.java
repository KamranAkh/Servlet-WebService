package net.javaguides.usermanagement.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.javaguides.usermanagement.model.User;

public class UserDAO {
	static HashMap<String, User> usersMap = new HashMap<String, User>();

	public User saveUser(User user) {
		usersMap.put(user.getId(), user);
		return usersMap.get(user.getId());
	}

	public User updateUser(User user) {
		User existingUser= usersMap.get(user.getId());
		if (existingUser != null) {
			existingUser.setName(user.getName());
			existingUser.setEmail(user.getEmail());
			existingUser.setCountry(user.getCountry());
		} else {
			usersMap.put(user.getId(), user);
		}
		return usersMap.get(user.getId());
	}

	public User deleteUser(String id) {
		User userResponse = usersMap.remove(id);
		return userResponse;
	}

	public User getUser(String id) {
		
		User user = usersMap.get(id);
		return user;
		
	}

	public List<User> getAllUser() {

		List<User> userList = new ArrayList<User>(usersMap.values());
		return userList;
		
	}
}
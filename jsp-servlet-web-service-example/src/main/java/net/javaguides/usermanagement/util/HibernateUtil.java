package net.javaguides.usermanagement.util;

import java.util.List;
import net.javaguides.usermanagement.dao.UserDAO;
import net.javaguides.usermanagement.model.User;

public class HibernateUtil {
	
	UserDAO userDao = new UserDAO();

	public List<User> getAllUsers() {
		List<User> userList = userDao.getAllUser();
		return userList;
	}

	public User getUserForId(String id) {
		User user = userDao.getUser(id);
		return user;
	}

	public User createUser(User user) {
		User userResponse = userDao.saveUser(user);
		return userResponse;
	}

	public User updateUser(User user) {
		User userResponse = userDao.updateUser(user);
		return userResponse;
	}

	public User deleteUser(String id) {
		User userResponse = userDao.deleteUser(id);
		return userResponse;
	}
	
}
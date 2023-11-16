package bloggy.services;

import java.util.List;


import bloggy.models.User;

public interface UserService {
	public User createUser(String firstName, String secondName, String username, String password, String confirmPassword);
	public void addRoleToUser(String role);
	public User loadUserByUsername(String username);


} 
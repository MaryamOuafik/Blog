package bloggy.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bloggy.models.User;
import bloggy.repositories.RoleRepository;
import bloggy.repositories.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepo ;
	private RoleRepository roleRepository;
	

	public UserServiceImpl(UserRepository userRepo, RoleRepository roleRepository) {
		super();
		this.userRepo = userRepo;
		this.roleRepository = roleRepository;
	}

	@Override
	public User createUser(String firstName, String secondName, String username, String password, String confirmedPassword) {
		
		return null;
		
}


	@Override
	public void addRoleToUser(String role) {
		
	}

	@Override
	public User loadUserByUsername(String username) {
		
		return userRepo.findByEmail(username);
	}


}
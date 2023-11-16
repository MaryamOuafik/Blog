package bloggy.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.*;

import bloggy.models.User;
import bloggy.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	UserService userService ;

	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
//	@CrossOrigin(origins = "http://localhost:8080")
//	@GetMapping("{idUser}")
//	public User getPost(@PathVariable("idUser")Long idUser) {
//		return userService.getUser(idUser);
//	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/")
	public String getWelcome() {
		return "Welcome here";
	}
	
//	@CrossOrigin
//	@PostMapping
//	public String createPost(@RequestBody User user) {
//		return userService.createUser(user);
//	}
	

	
//	@PutMapping
//	public String updatePost(@RequestBody User user ) {
//			return userService.updateUser(user);
//
//	}
//	
//	 @DeleteMapping("{idUser}")
//	 public String deletePost(Long idUser) {
//			return userService.deleteUser(idUser);
//
//	 }
}

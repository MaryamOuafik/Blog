package bloggy.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.*;

import bloggy.models.Post;
import bloggy.services.PostService;

@RestController
@RequestMapping("/post")
public class BlogController {
	PostService postService ;
	
	public BlogController(PostService postService) {
		super();
		this.postService = postService;
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("{idPost}")
	public Post getPost(@PathVariable("idPost")Long idPost) {
		return postService.getPost(idPost);
	}
	
	@GetMapping
	public List<Post> getAllPosts() {
		return postService.getAllPosts();
	}
	
	@CrossOrigin
	@PostMapping
	public String createPost(@RequestBody Post post) {
		return postService.createPost(post);
	}
	
	@PutMapping
	public String updatePost(@RequestBody Post post ) {
			return postService.updatePost(post);

	}
	
	 @DeleteMapping("{idPost}")
	 public String deletePost(Long idPost) {
			return postService.deletePost(idPost);

	 }
}

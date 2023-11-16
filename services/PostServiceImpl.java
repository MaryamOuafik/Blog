package services;

import java.util.List;

import org.springframework.stereotype.Service;

import models.Post;
import repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	PostRepository postRepo ;

	public PostServiceImpl(PostRepository postRepo) {
		super();
		this.postRepo = postRepo;
	}

	@Override
	public String createPost(Post post) {
		//More business logic
		postRepo.save(post);
		return "";
	}

	@Override
	public String updatePost(Post post) {
		//More business logic
		postRepo.save(post);
		return "";
	}

	@Override
	public String deletePost(Long id) {
		//More business logic
		postRepo.deleteById(id);
		return "";
	}

	@Override
	public Post getPost(Long id) {
		//More business logic
		return postRepo.findById(id).get();
	}

	@Override
	public List<Post> getAllPosts() {
		//More business logic
		return (List<Post>) postRepo.findAll();
				}

}

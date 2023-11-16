package bloggy.services;

import java.util.List;

import bloggy.models.Post;

public interface PostService {
	public String createPost(Post post);
	public String updatePost(Post post);
	public String deletePost(Long id);
	public Post getPost(Long id);
	public List<Post> getAllPosts();


}

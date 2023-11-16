package bloggy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bloggy.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}

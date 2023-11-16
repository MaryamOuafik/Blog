package bloggy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import bloggy.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String username);

}


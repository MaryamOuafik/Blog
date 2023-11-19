package bloggy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bloggy.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>  {

}

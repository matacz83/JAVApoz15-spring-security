package pl.sda.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.spring.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}

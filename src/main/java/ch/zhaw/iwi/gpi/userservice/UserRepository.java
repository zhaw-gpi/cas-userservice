package ch.zhaw.iwi.gpi.userservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * UserRepository
 */
@CrossOrigin
public interface UserRepository extends JpaRepository<User, String> {

}
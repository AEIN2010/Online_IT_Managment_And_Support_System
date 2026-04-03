package oimass.aeintech.loginservice.repos;

import oimass.aeintech.loginservice.entities.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserAccount, String> {




}

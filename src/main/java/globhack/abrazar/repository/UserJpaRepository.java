package globhack.abrazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import globhack.abrazar.entity.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer>{
    
}
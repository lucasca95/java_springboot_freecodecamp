package globhack.abrazar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import globhack.abrazar.entity.User;
import globhack.abrazar.repository.UserJpaRepository;

@Service
public class UserService {
    
    @Autowired
    UserJpaRepository repo;

    // Get all
    public List<User> findAll(){
        List<User> l_u = new ArrayList<>();
        for (User u : repo.findAll()) {
            l_u.add(new User(u.getId(),u.getFirstName(),u.getLastName(),u.getEmail(),"TOPSECRET",u.getType()));
        }
        return l_u;
    }
    // Get ONE by id
    public User findById(int id){
        Optional<User> u = repo.findById(id);
        if (u.isPresent()) return u.get();
        else return new User(-1, "None", "None", "None", "None", -1);
    }

    public User createUser(User user){
        return repo.save(user);
    }
}
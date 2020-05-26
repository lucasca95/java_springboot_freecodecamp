package globhack.abrazar.controller.user;

import org.springframework.web.bind.annotation.RestController;

import globhack.abrazar.entity.User;
import globhack.abrazar.service.UserService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User> findAll() {
        return service.findAll();
    }
    @RequestMapping(value="/users/{id}", method=RequestMethod.GET)
    public User findById(@PathVariable(name = "id") int id) {
        return service.findById(id);
    }
    @RequestMapping(value="/users", method=RequestMethod.POST)
    public User create(@Valid @RequestBody User user) {
        return service.createUser(user);
    }
}
package ua.ithillel.exceptions.users.repo;


import ua.ithillel.exceptions.users.model.User;

public interface UserRepo {
     void save(User u);
     boolean existsByUsername(String usernameß);
}

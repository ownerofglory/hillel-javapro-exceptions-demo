package ua.ithillel.exceptions.users.service;


import ua.ithillel.exceptions.users.exception.UserAlreadyExistsException;
import ua.ithillel.exceptions.users.model.User;
import ua.ithillel.exceptions.users.repo.UserRepo;

public class UserServiceDefault implements UserService {
    private UserRepo userRepo;

    public UserServiceDefault(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void saveUser(String username, String password) throws UserAlreadyExistsException {
        User user = new User(username, password);
        if (userRepo.existsByUsername(username)) {
            throw new UserAlreadyExistsException(username);
        }

        userRepo.save(user);
    }
}

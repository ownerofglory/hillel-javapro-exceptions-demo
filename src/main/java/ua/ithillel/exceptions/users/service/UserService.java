package ua.ithillel.exceptions.users.service;


import ua.ithillel.exceptions.users.exception.UserAlreadyExistsException;

public interface UserService {
    void saveUser(String username, String password) throws UserAlreadyExistsException;
}

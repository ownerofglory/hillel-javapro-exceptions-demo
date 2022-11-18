package ua.ithillel.exceptions.users.repo;


import ua.ithillel.exceptions.users.model.User;

public class UserFileStoreRepo implements UserRepo {
    @Override
    public void save(User u) {

    }

    @Override
    public boolean existsByUsername(String username) {
        return false;
    }
}

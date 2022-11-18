package ua.ithillel.exceptions.users.repo;


import ua.ithillel.exceptions.users.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserInMemoryRepo implements UserRepo {
    private List<User> users = new ArrayList<>();

    @Override
    public void save(User u) {
        users.add(u);
    }

    @Override
    public boolean existsByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .collect(Collectors.toList()).size() > 0;
    }
}

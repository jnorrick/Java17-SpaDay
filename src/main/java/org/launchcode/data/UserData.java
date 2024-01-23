package org.launchcode.data;

import org.launchcode.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    List<User> users = new ArrayList<>();


    public void add(User user) {
        users.add(user);
    }

    public List<User> getAll() {
        return users;
    }

    public User getByID (int ID) {
        for(User user: users){
            if(user.getID() == ID) {
                return user;
            }
        }
        return null;
    }
}

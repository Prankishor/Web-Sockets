package com.horizon.ChatApplication.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepo;

    public void saveUser(User user){
        user.setStatus(Status.ONLINE);
        userRepo.save(user);
    }

    public void disconnect(User user){
        var storedUser = userRepo.findById(user.getNickName()).orElse(null);

        if(storedUser != null)
        {
            storedUser.setStatus(Status.OFFLINE);
            userRepo.save(storedUser);
        }
    }

    public List<User> findConnectedUsers(){
        return userRepo.findAllByStatus(Status.ONLINE);
    }
}

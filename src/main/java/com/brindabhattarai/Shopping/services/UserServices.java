package com.brindabhattarai.Shopping.services;


import com.brindabhattarai.Shopping.entity.User;
import com.brindabhattarai.Shopping.pojo.UserPojo;

import java.util.List;

public interface UserServices {
    String save (UserPojo userpojo);
    User findByEmail(String email);

    User fetchById(Integer id);

    List<User> fetchAll();

    void deleteById(Integer id);

    String updateResetPassword(String email);

    void processPasswordResetRequest(String email);

    void sendEmail();
}

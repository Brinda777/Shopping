package com.brindabhattarai.Shopping.services;

import com.brindabhattarai.Shopping.pojo.AdminPojo;

public interface AdminServices {
    String save (AdminPojo adminPojo);
    AdminPojo findByEmail(String email);
}

package com.brindabhattarai.Shopping.services.impl;

import com.brindabhattarai.Shopping.entity.Admin;
import com.brindabhattarai.Shopping.exception.AppException;
import com.brindabhattarai.Shopping.pojo.AdminPojo;
import com.brindabhattarai.Shopping.pojo.UserPojo;
import com.brindabhattarai.Shopping.repo.AdminRepo;
import com.brindabhattarai.Shopping.repo.UserRepo;
import com.brindabhattarai.Shopping.entity.User;
import com.brindabhattarai.Shopping.services.AdminServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminServices {
    private final AdminRepo adminRepo;

    @Override
    public String save(AdminPojo adminPojo){
        Admin admin =new Admin();
        admin.setFull_name(adminPojo.getFullname());
        admin.setAddress(adminPojo.getAddress());
        admin.setEmail(adminPojo.getEmail());
        admin.setMobileNo(adminPojo.getMobile_no());

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(adminPojo.getPassword());
        admin.setPassword(encodePassword);

        adminRepo.save(admin);
        return "created";
    }

    @Override
    public AdminPojo findByEmail(String email) {
        Admin admin = adminRepo.findByEmail(email)
                .orElseThrow(() -> new AppException("Invalid User email", HttpStatus.BAD_REQUEST));
        return new AdminPojo(admin);
    }


}

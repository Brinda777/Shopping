package com.brindabhattarai.Shopping.repo;

import com.brindabhattarai.Shopping.entity.Admin;
import com.brindabhattarai.Shopping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin,Integer> {

    @Query(value="select * from admin where email=?1", nativeQuery = true)
    Optional<Admin> findByEmail(String email);
}

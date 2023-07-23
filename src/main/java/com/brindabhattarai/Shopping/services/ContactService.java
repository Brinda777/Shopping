package com.brindabhattarai.Shopping.services;



import com.brindabhattarai.Shopping.entity.Contact;
import com.brindabhattarai.Shopping.pojo.ContactPojo;

import java.util.List;

public interface ContactService {
    String save(ContactPojo contactPojo);

    List<Contact> fetchAll();

    void deleteById(Integer id);
}

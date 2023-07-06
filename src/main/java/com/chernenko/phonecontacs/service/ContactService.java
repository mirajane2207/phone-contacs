package com.chernenko.phonecontacs.service;

import com.chernenko.phonecontacs.model.Contact;
import com.chernenko.phonecontacs.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactService {

    private final ContactRepository contactRepository;

    public List<Contact> findAll () {
        return contactRepository.findAll();
    }


}

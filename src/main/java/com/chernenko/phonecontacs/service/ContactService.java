package com.chernenko.phonecontacs.service;

import com.chernenko.phonecontacs.dto.ContactDTO;
import com.chernenko.phonecontacs.model.Contact;
import com.chernenko.phonecontacs.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactService {

    private final ContactRepository contactRepository;

    public Contact create(ContactDTO contactDTO) {
        return contactRepository.save(Contact.builder()
                .name(contactDTO.getName())
                .emails(contactDTO.getEmails())
                .numbers(contactDTO.getNumbers())
                .build());
    }

    public List<Contact> getAll () {
        return contactRepository.findAll();
    }

    public Contact update(Contact contact) {
        return contactRepository.save(contact);
    }

    public void delete(Long id) {
        contactRepository.deleteById(id);
    }
}

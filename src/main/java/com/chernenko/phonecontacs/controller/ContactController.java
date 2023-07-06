package com.chernenko.phonecontacs.controller;

import com.chernenko.phonecontacs.dto.ContactDTO;
import com.chernenko.phonecontacs.model.Contact;
import com.chernenko.phonecontacs.service.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> create(@RequestBody ContactDTO contactDTO) {
        return new ResponseEntity<>(contactService.create(contactDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getAll() {
        return new ResponseEntity<>(contactService.getAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Contact> update(@RequestBody Contact contact) {
        return new ResponseEntity<>(contactService.update(contact), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        contactService.delete(id);
        return HttpStatus.OK;
    }
}

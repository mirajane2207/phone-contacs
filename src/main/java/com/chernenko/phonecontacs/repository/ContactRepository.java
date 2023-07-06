package com.chernenko.phonecontacs.repository;

import com.chernenko.phonecontacs.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
}

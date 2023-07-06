package com.chernenko.phonecontacs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
public class Contact {
    @Id
    @GeneratedValue
    private Long id;
    private String emails;

    public Contact(String emails, String number) {
        this.emails = emails;
        this.number = number;
    }

    public Contact() {

    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(emails, contact.emails) && Objects.equals(number, contact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emails, number);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", emails='" + emails + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

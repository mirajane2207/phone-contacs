package com.chernenko.phonecontacs.dto;

import lombok.Data;

import java.util.Set;

@Data
public class ContactDTO {

    private String name;

    private Set<String> emails;

    private Set<String> numbers;
}

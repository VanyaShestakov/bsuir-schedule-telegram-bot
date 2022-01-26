package com.ivanshestakov.bsuirscheduletelegrambot.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Employee {

    private int id;

    private String firstName;

    private String lastName;

    private String middleName;

    private String degree;

    private String rank;

    private String photoLink;

    @JsonProperty("fio")
    private String fullName;
}

package com.ivanshestakov.bsuirscheduletelegrambot.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentGroup {

    private int id;
    private String name;
    private int facultyId;
    private String facultyName;
    private int specialityDepartmentEducationFormId;

    @JsonProperty("specialityName")
    private String specialityName;

    @JsonProperty("course")
    private int courseNumber;

    private String calendarId;
}

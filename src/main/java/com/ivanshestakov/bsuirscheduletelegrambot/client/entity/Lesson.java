package com.ivanshestakov.bsuirscheduletelegrambot.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Lesson {

    @JsonProperty("weekNumber")
    private List<Integer> weekNumbers;

    @JsonProperty("studentGroup")
    private List<String> groupNumbers;

    @JsonProperty("studentGroupInformation")
    private List<String> groupInformation;

    @JsonProperty("numSubgroup")
    private int subgroupNumber;

    @JsonProperty("auditory")
    private List<String> auditoryNumbers;

    private String lessonTime;

    private String startLessonTime;

    @JsonProperty("endLessonTime")
    private String endLessonTime;

    @JsonProperty("subject")
    private String subjectName;

    private String note;

    private String lessonType;

    @JsonProperty("employee")
    private List<Employee> employees;

    @JsonProperty("zaoch")
    private boolean isDistance;

}

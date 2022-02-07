package com.ivanshestakov.bsuirscheduletelegrambot.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanshestakov.bsuirscheduletelegrambot.dto.LessonDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public LessonDto toDto() {
        final var employeeName = employees.stream()
                .map(employee -> employee.getFullName())
                .collect(Collectors.joining(","));

        return LessonDto.builder()
                .auditoryNumbers(auditoryNumbers)
                .employeeName(employeeName)
                .lessonType(lessonType)
                .startLessonTime(startLessonTime)
                .endLessonTime(endLessonTime)
                .subjectName(subjectName)
                .subgroupNumber(subgroupNumber)
                .weekNumbers(weekNumbers)
                .build();
    }

}

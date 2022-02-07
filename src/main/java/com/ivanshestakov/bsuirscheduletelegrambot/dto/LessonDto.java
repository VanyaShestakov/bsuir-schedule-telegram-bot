package com.ivanshestakov.bsuirscheduletelegrambot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanshestakov.bsuirscheduletelegrambot.client.entity.Employee;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LessonDto {

    private List<Integer> weekNumbers;

    private int subgroupNumber;

    private List<String> auditoryNumbers;

    private String startLessonTime;

    private String endLessonTime;

    private String subjectName;

    private String note;

    private String lessonType;

    private String employeeName;

    @Override
    public String toString() {
        return null;
    }

}

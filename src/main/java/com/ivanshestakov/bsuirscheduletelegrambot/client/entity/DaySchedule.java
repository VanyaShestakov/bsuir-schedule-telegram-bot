package com.ivanshestakov.bsuirscheduletelegrambot.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanshestakov.bsuirscheduletelegrambot.dto.DayScheduleDto;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class DaySchedule {

    private String weekDay;

    private List<Lesson> lessons;

    public DayScheduleDto toDto() {
        return DayScheduleDto.builder()
                .weekDay(weekDay)
                .lessons(lessons.stream().map(Lesson::toDto).collect(Collectors.toList()))
                .build();
    }
}

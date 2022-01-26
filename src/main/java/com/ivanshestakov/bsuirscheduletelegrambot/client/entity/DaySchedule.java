package com.ivanshestakov.bsuirscheduletelegrambot.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DaySchedule {

    private String weekDay;

    @JsonProperty("schedule")
    private List<Lesson> lessons;
}

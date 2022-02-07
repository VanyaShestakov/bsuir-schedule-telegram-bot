package com.ivanshestakov.bsuirscheduletelegrambot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ivanshestakov.bsuirscheduletelegrambot.client.entity.Lesson;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DayScheduleDto {

    private String weekDay;

    private List<LessonDto> lessons;
}

package com.ivanshestakov.bsuirscheduletelegrambot.service.impl;

import com.ivanshestakov.bsuirscheduletelegrambot.client.ScheduleClient;
import com.ivanshestakov.bsuirscheduletelegrambot.client.entity.Lesson;
import com.ivanshestakov.bsuirscheduletelegrambot.dto.DayScheduleDto;
import com.ivanshestakov.bsuirscheduletelegrambot.dto.LessonDto;
import com.ivanshestakov.bsuirscheduletelegrambot.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleClient scheduleClient;

    @Autowired
    public ScheduleServiceImpl(ScheduleClient scheduleClient) {
        this.scheduleClient = scheduleClient;
    }

    @Override
    public DayScheduleDto getTodaySchedule(String groupNumber) {
        final var schedule = scheduleClient.getSchedule(groupNumber);
        final var lessons = schedule.getTodayLessons()
                .stream()
                .map(Lesson::toDto)
                .collect(Collectors.toList());
        final var todayDate = schedule.getTodayDate();
        final var weekDay = todayDate.getDayOfWeek();

        return DayScheduleDto.builder()
                .lessons(lessons)
                .todayDate(todayDate.toString())
                .weekDay(weekDay.toString())
                .build();
    }

    @Override
    public LessonDto getCurrentLesson(String groupNumber) {
        return null;
    }
}

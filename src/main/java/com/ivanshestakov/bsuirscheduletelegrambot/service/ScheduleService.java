package com.ivanshestakov.bsuirscheduletelegrambot.service;

import com.ivanshestakov.bsuirscheduletelegrambot.dto.DayScheduleDto;
import com.ivanshestakov.bsuirscheduletelegrambot.dto.LessonDto;

public interface ScheduleService {

    DayScheduleDto getDaySchedule(final String groupNumber);

    LessonDto getCurrentLesson(final String groupNumber);
}

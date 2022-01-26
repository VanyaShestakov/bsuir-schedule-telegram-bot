package com.ivanshestakov.bsuirscheduletelegrambot.client.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Schedule {

    private Employee employee;

    private StudentGroup studentGroup;

    @JsonProperty("schedules")
    private List<DaySchedule> daySchedules;

    @JsonProperty("examSchedules")
    private List<DaySchedule> examSchedules;

    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate todayDate;

    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate tomorrowDate;

    @JsonProperty("todaySchedules")
    private List<Lesson> todayLessons;

    @JsonProperty("tomorrowSchedules")
    private List<Lesson> tomorrowLessons;

    private int currentWeekNumber;

    @JsonProperty("dateStart")
    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate semesterStart;

    @JsonProperty("dateEnd")
    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate semesterEnd;

    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate sessionStart;

    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate sessionEnd;

}

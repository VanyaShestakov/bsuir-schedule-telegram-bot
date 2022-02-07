package com.ivanshestakov.bsuirscheduletelegrambot.controller;

import com.ivanshestakov.bsuirscheduletelegrambot.client.ScheduleClient;
import com.ivanshestakov.bsuirscheduletelegrambot.client.entity.Schedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/test")
@Slf4j
public class TestController {

    private final ScheduleClient scheduleClient;

    @Autowired
    public TestController(ScheduleClient scheduleClient) {
        this.scheduleClient = scheduleClient;
    }

    @GetMapping("/{groupNumber}")
    @ResponseStatus(HttpStatus.OK)
    public Schedule getSchedule(@PathVariable String groupNumber) {
        log.info(System.getenv("BOT_USERNAME"));
        return scheduleClient.getSchedule(groupNumber);
    }

}

package com.ivanshestakov.bsuirscheduletelegrambot.client.impl;

import com.ivanshestakov.bsuirscheduletelegrambot.client.ScheduleClient;
import com.ivanshestakov.bsuirscheduletelegrambot.client.entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ScheduleClientImpl implements ScheduleClient {

    @Value("${bsuir.api.schedule.url}")
    private String SCHEDULE_URL;

    private final RestTemplate restTemplate;

    @Autowired
    public ScheduleClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Schedule getSchedule(String groupNumber) {
        //restTemplate.execute(SCHEDULE_URL + groupNumber, HttpMethod.GET, null, Schedule.class);
        return restTemplate.exchange(SCHEDULE_URL + groupNumber, HttpMethod.GET, null, Schedule.class).getBody();
    }
}

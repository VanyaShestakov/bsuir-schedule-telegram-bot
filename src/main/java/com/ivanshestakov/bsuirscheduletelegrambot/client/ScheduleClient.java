package com.ivanshestakov.bsuirscheduletelegrambot.client;

import com.ivanshestakov.bsuirscheduletelegrambot.client.entity.Schedule;

public interface ScheduleClient {

    Schedule getSchedule(String groupNumber);
}

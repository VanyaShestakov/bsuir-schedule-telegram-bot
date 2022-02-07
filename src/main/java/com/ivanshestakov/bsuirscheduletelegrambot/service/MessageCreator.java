package com.ivanshestakov.bsuirscheduletelegrambot.service;

import com.ivanshestakov.bsuirscheduletelegrambot.dto.DayScheduleDto;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

public interface MessageCreator {

    List<SendMessage> createMessagesForDayScheduleDto(final DayScheduleDto dayScheduleDto, final String chatId);
}

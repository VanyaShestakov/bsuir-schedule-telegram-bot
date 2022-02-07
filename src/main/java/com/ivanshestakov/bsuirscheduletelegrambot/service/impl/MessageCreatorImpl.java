package com.ivanshestakov.bsuirscheduletelegrambot.service.impl;

import com.ivanshestakov.bsuirscheduletelegrambot.dto.DayScheduleDto;
import com.ivanshestakov.bsuirscheduletelegrambot.service.MessageCreator;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

@Service
public class MessageCreatorImpl implements MessageCreator {

    @Override
    public List<SendMessage> createMessagesForDayScheduleDto(final DayScheduleDto dayScheduleDto, final String chatId) {
        return null;
    }
}

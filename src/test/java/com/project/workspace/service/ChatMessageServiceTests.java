package com.project.workspace.service;

import com.project.workspace.domain.vo.ChatMessageMyBatisVO;
import com.project.workspace.domain.vo.ChatMessageVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class ChatMessageServiceTests {

    @Autowired
    private ChatMessageService chatMessageService;

    @Test
    public void getMyChatListTest(){
        List<ChatMessageMyBatisVO> data   = chatMessageService.getChatList("최종현","한서현");
        log.info("++++++++++++++++++++++++++++++++++++++++++++++++++");
        data.forEach(e -> log.info(e.toString()) );
        log.info("++++++++++++++++++++++++++++++++++++++++++++++++++");


    }

//    @Test
//    public void insertRoom(){
//        chatMessageService.insertRoom("박상아","송준형", "박상아송준형");
//    }

//    @Test
//    public void getChatHistory(){
//    chatMessageService.getChatHistory("최종현", "배상혁");
//    }

//    @Test
//    public void getChatListTest(){
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        chatMessageService.getChatList("hsh1103&최종현").stream().map(ChatMessageVO::toString).forEach(log::info);
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//    }
//



}

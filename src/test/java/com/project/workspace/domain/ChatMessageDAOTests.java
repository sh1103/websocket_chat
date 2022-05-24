package com.project.workspace.domain;

import com.project.workspace.domain.dao.ChatMessageDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ChatMessageDAOTests {
    @Autowired
    private ChatMessageDAO chatMessageDAO;

    @Test
    public void insertRoomTest(){
//        ChatMessageVO senderId = new ChatMessageVO();
//        ChatMessageVO receiverId = new ChatMessageVO();
//
//        ChatUserVO chatUserVO = new ChatUserVO();
//
//        senderId.setChatUserVO(chatUserVO.getUserId("송준형"));
//        receiverId.setChatUserVO1(chatUserVO.getUserId("박상아"));
        chatMessageDAO.insertRoom("송준형", "박상아","송준형박상아");
    }
}

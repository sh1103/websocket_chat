package com.project.workspace.mapper;

import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatUserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
@Slf4j
public class ChatMessageMapperTests {
    @Autowired
    private ChatMessageMapper chatMessageMapper;

    @Autowired
    private ChatUserRepository chatUserRepository;
//
//    @Test
//    public void getConnectRoomNameTest(){
//        chatMessageMapper.getConnectRoomName("한서현","최종현");
//    }


//    @Test
//    public void insertRoomTest(){
////        ChatMessageVO senderId = new ChatMessageVO();
////        ChatMessageVO receiverId = new ChatMessageVO();
////        ChatMessageVO roomName = new ChatMessageVO();
////        senderId.setChatUserVO;
////        receiverId.setChatUserVO1('최종현');
////        roomName.setRoomName('한서현최종현');
//        chatMessageMapper.insertRoom("송준형","한서현","송준형한서현");
//    }

//    @Test
//        public void getChatHistoryTest(){
//
//        try {
//            chatMessageMapper.getChatHistory("최종현","24ㅇㄴ2");
//        } catch (Exception e) {
//            log.info("잘못된 유저입니다.");
//            return ;
//        }
//
//    }



    @Test
    @Transactional
    public void getChatListTest(){
//        ChatMessageVO senderId = new ChatMessageVO();
//        ChatMessageVO receiverId = new ChatMessageVO();
//        ChatUserVO chatUserVO = new ChatUserVO();
//        senderId.setChatUserVO(chatUserVO.getUserId('한서현'));
//        receiverId.setChatUserVO1(chatUserVO.getUserId("최종현"));
        chatMessageMapper.getChatList("한서현","최종현");
    }
//다대다
//    @Test
//    public void getMyChatListTest(){
//        ChatUserVO senderId = new ChatUserVO();
//        ChatUserVO receiverId = new ChatUserVO();
//        senderId.setUserId("최종현");
//        receiverId.setUserId("최종현");
//        String a = "최종현";
//        String b = "최종현";
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        chatMessageMapper.getMyChatList(a,b);
////        list.stream().map(ChatMessageVO::getChatRoomVO).forEach(log::info);
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//    }
}

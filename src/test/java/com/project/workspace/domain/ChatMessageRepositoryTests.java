package com.project.workspace.domain;

import com.project.workspace.domain.repository.ChatMessageRepository;
import com.project.workspace.domain.repository.ChatRoomRepository;
import com.project.workspace.domain.repository.ChatRoomsRepository;
import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatRoomVO;
import com.project.workspace.domain.vo.ChatUserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ChatMessageRepositoryTests {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @Autowired
    private ChatRoomsRepository chatRoomsRepository;

    @Autowired
    private ChatUserRepository chatUserRepository;

    @Test
    public void insertTest(){
        ChatRoomVO chatRoomVO = chatRoomsRepository.findById("third").get();
//        log.info(chatRoomVO.toString());
        ChatUserVO chatUserVO = chatUserRepository.findById(4L).get();
//        log.info(chatUserVO.toString());
        chatMessageRepository.save(ChatMessageVO.builder()
                .chatRoomVO(chatRoomVO).chatUserVO(chatUserVO)
                .message("가서 자려구요 낼봐요~").chatTime("2022-05-18 02:02").build());
    }
}

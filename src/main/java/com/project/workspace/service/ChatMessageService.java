package com.project.workspace.service;


import com.project.workspace.domain.repository.ChatMessageRepository;

import com.project.workspace.domain.repository.ChatRoomsRepository;
import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatRoomVO;
import com.project.workspace.domain.vo.ChatUserVO;
import com.project.workspace.payload.request.ChatMessageRequest;
import com.project.workspace.payload.request.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatMessageService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatRoomsRepository chatRoomsRepository;
    private final ChatUserRepository chatUserRepository;

    public String messageSave(ChatMessageRequest request){
        ChatRoomVO chatRoomVO = chatRoomsRepository.findById("third").get();
        ChatUserVO chatUserVO = chatUserRepository.findById(4L).get();
        chatMessageRepository.save(ChatMessageVO.builder()
                .chatRoomVO(chatRoomVO).chatUserVO(chatUserVO)
                .message(request.getMessage()).chatTime(request.getChatTime()).build());
        return "Chat Save Success";
    }


}

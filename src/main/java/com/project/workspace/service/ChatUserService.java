package com.project.workspace.service;

import com.project.workspace.domain.vo.ChatUserVO;
import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.payload.request.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatUserService {

    private final ChatUserRepository chatUserRepository;

    public String signup(UserRequest request){
        chatUserRepository.save(ChatUserVO.builder()
                .userId(request.getUserId())
                .userPw(request.getUserPw())
                .build());
        return "Success";
    }

    public String login(String userId, String userPw) {
        Optional<ChatUserVO> user = chatUserRepository.findByUserId(userId);
        log.info("db password = {}, input password = {}", user.get().getUserPw(), userPw);
        if(user.get().getUserPw().equals(userPw)) {
            log.info("성공 들어옴");
            return "Success";
        }else{
            log.info("실패 들어옴");

            return "Failed";
        }
    }
}
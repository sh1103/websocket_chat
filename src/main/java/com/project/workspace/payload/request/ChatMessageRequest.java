package com.project.workspace.payload.request;

import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatUserVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ChatMessageRequest {
    String message;
    String chatTime;
    ChatMessageVO roomName;
    ChatUserVO userId;
    String chatFile;
}

package com.project.workspace.domain.vo;

import lombok.*;
import org.apache.ibatis.annotations.Many;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "chat_message")
@DynamicInsert
public class ChatMessageVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_num")
    private Long messageNum;

    @Column(name = "message")
    private String message;

    @Column(name = "chat_time")
    private String chatTime;

    @Column(name = "chat_file")
    private String chatFile;

    @ManyToOne
    @JoinColumn(name = "room_name")
    private ChatRoomVO chatRoomVO;

    @ManyToOne
    @JoinColumn(name = "user_num")
    private ChatUserVO chatUserVO;



    @Builder

    public ChatMessageVO(String message, String chatTime, String chatFile, ChatRoomVO chatRoomVO, ChatUserVO chatUserVO) {
        this.message = message;
        this.chatTime = chatTime;
        this.chatFile = chatFile;
        this.chatRoomVO = chatRoomVO;
        this.chatUserVO = chatUserVO;
    }
}

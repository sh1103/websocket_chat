package com.project.workspace.domain.vo;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "chat_room_join")
@DynamicInsert
public class ChatRoomJoinVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "join_id")
    private Long joinId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private ChatUserVO chatUserVO;

    @ManyToOne
    @JoinColumn(name = "room_name")
    private ChatRoomVO chatRoomVO;

    @Builder
    public ChatRoomJoinVO(ChatUserVO chatUserVO, ChatRoomVO chatRoomVO) {
        this.chatUserVO = chatUserVO;
        this.chatRoomVO = chatRoomVO;
    }
}

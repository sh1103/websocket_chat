package com.project.workspace.domain.vo;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString (of = {"userId","userPw"})
@Table(name = "chat_user")
@DynamicInsert
public class ChatUserVO {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_pw")
    private String userPw;


    @Builder
    public ChatUserVO(String userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }

}

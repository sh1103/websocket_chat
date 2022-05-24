package com.project.workspace.domain.repository;

import com.project.workspace.domain.vo.ChatMessageVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ChatMessageRepository extends JpaRepository<ChatMessageVO, Long> {

//    @Query( value = "select message_num, message, chat_time, sender_id , receiver_id, chat_file, room_name from chat_message  where (sender_id = :senderId and receiver_id = :receiverId) or (sender_id = :receiverId and receiver_id = :senderId) order by message_num", nativeQuery = true )
//    List<ChatMessageVO> testList (@Param("receiverId")String receiverId, @Param("senderId")String senderId);
}

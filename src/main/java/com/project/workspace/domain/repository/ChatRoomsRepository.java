package com.project.workspace.domain.repository;

import com.project.workspace.domain.vo.ChatRoomVO;
import com.project.workspace.domain.vo.ChatUserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomsRepository extends JpaRepository<ChatRoomVO, String> {
}

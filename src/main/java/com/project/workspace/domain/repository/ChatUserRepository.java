package com.project.workspace.domain.repository;

import com.project.workspace.domain.vo.ChatUserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChatUserRepository extends JpaRepository<ChatUserVO, Long> {
    Optional<ChatUserVO> findByUserId(String userId);
}
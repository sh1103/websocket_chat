package com.project.workspace.controller;

import com.project.workspace.domain.vo.ChatUserVO;
import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.payload.request.UserRequest;
import com.project.workspace.service.ChatUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController

@RequiredArgsConstructor
public class ChatUserController {

    private final ChatUserService chatUserService;
    private final ChatUserRepository chatUserRepository;
    private  final  ChatUserRepository chatRoomRepository;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody UserRequest request) {
        log.info("userId = {}, password = {}", request.getUserId(), request.getUserPw());
        if(chatUserService.signup(request).equals("Success")) {
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping("/")
    public ModelAndView manage() {
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }
    @RequestMapping("/home")
    public ModelAndView manage1() {
        ModelAndView mav = new ModelAndView("home");

        return mav;
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserRequest userRequest, HttpServletRequest req) {
        HttpSession session = req.getSession();
        log.info("userId = {}, userPw = {}", userRequest.getUserId(), userRequest.getUserPw());
        if(chatUserService.login(userRequest.getUserId(), userRequest.getUserPw()).equals("Success")) {
            session.setAttribute("userId", userRequest.getUserId());
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    //user목록 가져오기
    @GetMapping("/list")
    public List<String> List(){
        List<String> list = chatUserRepository.findAll().stream().map(ChatUserVO::getUserId).collect(Collectors.toList());
        return list;
    }
}
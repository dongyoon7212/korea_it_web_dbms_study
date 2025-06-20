package com.koreait.dbms_study.controller;

import com.koreait.dbms_study.dto.AddPostReqDto;
import com.koreait.dbms_study.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/add")
    public ResponseEntity<?> addPost(@RequestBody AddPostReqDto addPostReqDto) {
        return ResponseEntity.ok(postService.addPost(addPostReqDto));
    }

    @GetMapping("/get/{postId}")
    public ResponseEntity<?> getPost(@PathVariable Integer postId) {
        return ResponseEntity.ok(postService.getPostByPostId(postId));
    }

    @GetMapping("/get/list")
    public ResponseEntity<?> getPostList() {
        return ResponseEntity.ok(postService.getPostList());
    }
}

package com.kim.minsang.controller;

import com.kim.minsang.entity.Post;
import com.kim.minsang.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Controller
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/")
    public String hello(){
        return "Main Page";
    }

    @GetMapping("/post")
    public List<Post> getAllPost(){
        return postRepository.findAll();
    }

    @PostMapping("/post/{id}")
    public Post updatePost(@PathVariable String id , @RequestBody Post newPost){
        Long postID = Long.parseLong(id);

        Optional<Post> post = postRepository.findById(postID);

        return post.get();
    }
}

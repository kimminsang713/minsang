package com.kim.minsang.controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = PostController.class)
public class PostConrollerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void PostReturnd() throws Exception{
        String post = "post";
        mvc.perform(get("/post"))
                .andExpect(status().isOk());
    }
}

package com.alex.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith({SpringExtension.class})
@WebMvcTest(value=HelloController.class)
class HelloControllerTest {
  @Autowired
  private MockMvc mvc;
  
  @Test
  void when_get_hello_return_hello() throws Exception {
    MvcResult result = mvc.perform(get("http://9191/hello"))
            .andDo(print())
            .andReturn();
    String contentAsString = result.getResponse().getContentAsString();
    assertEquals("Hello Worldxxx", contentAsString);
  }
}

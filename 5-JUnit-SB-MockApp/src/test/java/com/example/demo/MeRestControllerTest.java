package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controller.MyController;
import com.example.demo.service.MsgService;

@WebMvcTest(value = MyController.class)
public class MeRestControllerTest {

	@MockBean
	private MsgService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testWelcome() throws Exception {
		// defining mock obj behaviour
				when(service.welcomeMsg()).thenReturn("Welcome to house");

				// preparing request
				MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");

				// sending request
				MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();

				// get the response
				MockHttpServletResponse response = mvcResult.getResponse();

				// validate response status code
				int status = response.getStatus();
				assertEquals(200, status);
	}
	
	@Test
	public void testGreet() throws Exception {
		
		when(service.greetMsg()).thenReturn("Good Evening");
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		int status = result.getResponse().getStatus();
		assertEquals(200, status);
	}
	
}

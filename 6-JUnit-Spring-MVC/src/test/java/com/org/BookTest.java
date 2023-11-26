package com.org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.binding.Book;
import com.org.rest.DemoRestController;
import com.org.service.BookService;

@WebMvcTest(value = DemoRestController.class)
public class BookTest {

	@MockBean
	private BookService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testSaveBook() throws Exception {
		when(service.saveBook(ArgumentMatchers.any())).thenReturn(true);
		
		Book book = new Book(101,"Java",500.0);
		ObjectMapper mapper = new ObjectMapper();
		String string = mapper.writeValueAsString(book);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/book")
		                      .contentType(MediaType.APPLICATION_JSON)
		                      .content(string);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		int status = result.getResponse().getStatus();
		assertEquals(201, status);
	}
}

package com.dbs.firstwebapp.controller;

import com.dbs.firstwebapp.model.Course;
import com.dbs.firstwebapp.service.TrainingService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest
@AutoConfigureMockMvc
public class TrainingControllerTest {

	@MockitoBean
	private TrainingService trainingService;

	@Autowired
	private MockMvc mockMvc;

	Course course;

	@BeforeEach
	public void setup() {
		course = new Course("C10","JS","3 days");
		when(trainingService.getCourse("C10")).thenReturn(course);
	}

	@Test
	@WithMockUser(username = "john", roles = "DEVELOPER")
	public void testTrainingController() throws Exception {
		MvcResult response = mockMvc.perform(get("/courses/{id}", course.getId())).andExpect(status().isOk())
				.andReturn();

		String json = response.getResponse().getContentAsString();
		ObjectMapper objectMapper = new ObjectMapper();
		Course c = objectMapper.readValue(json, Course.class);
		assertEquals("C10", c.getId());

	}
}

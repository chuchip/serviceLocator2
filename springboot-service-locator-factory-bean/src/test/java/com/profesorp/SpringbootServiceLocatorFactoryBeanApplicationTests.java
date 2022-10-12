package com.profesorp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringbootServiceLocatorFactoryBeanApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Calling get car y truck with mockMVC")
	public void test1() throws Exception {
		this.mockMvc.perform(get("/Car")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("car")));
		this.mockMvc.perform(get("/Truck")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("truck")));
	}
	@Test
	@DisplayName("Calling get Moto with mockMVC")
	public void testMoto() throws Exception {

		this.mockMvc.perform(get("/Moto")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("moto")));
	}
}

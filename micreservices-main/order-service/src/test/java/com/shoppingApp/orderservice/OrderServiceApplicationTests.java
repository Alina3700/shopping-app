package com.shoppingApp.orderservice;

import com.shoppingApp.orderservice.dto.OrderRequest;
import com.shoppingApp.orderservice.repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class OrderServiceApplicationTests {
//	@Container
//	static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer<>("postgres:15.1");
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private OrderRepository orderRepository;
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
//		dynamicPropertyRegistry.add("spring.datasource.username", postgreSQLContainer::getUsername);
//		dynamicPropertyRegistry.add("spring.datasource.password", postgreSQLContainer::getPassword);
//	}
//
//
//	@Test
//	void shouldPlaceOrder() throws Exception {
//		OrderRequest orderRequest = new OrderRequest();
//		String orderRequestString = objectMapper.writeValueAsString(orderRequest);
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/order")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(orderRequestString))
//				        .andExpect(status().isCreated());
//
//		Assertions.assertEquals(1, orderRepository.findAll().size());
//	}
}

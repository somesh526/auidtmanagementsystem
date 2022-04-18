package com.cognizant.auditseverity;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;


@SpringBootTest
@WebAppConfiguration
@AutoConfigureMockMvc(addFilters = false)
class AuditSeverityApplicationTests {


	@Test
	void contextLoads() {
	}


}

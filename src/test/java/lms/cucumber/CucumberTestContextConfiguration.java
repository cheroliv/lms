package lms.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import lms.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

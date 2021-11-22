package br.dev.luigi.springlab;

import br.dev.luigi.springlab.payroll.Employee;
import br.dev.luigi.springlab.payroll.EmployeeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringlabApplicationTests {

	@Autowired
	private EmployeeController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

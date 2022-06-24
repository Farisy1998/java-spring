package com.spring.springboot.injectinglist;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjectinglistApplicationTests {

	@Autowired
	List<String> courseList;

	@Test
	void testCourseListInjection() {
		System.out.println(courseList);
	}

}

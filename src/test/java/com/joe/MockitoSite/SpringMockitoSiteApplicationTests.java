package com.joe.MockitoSite;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpringMockitoSiteApplicationTests {

	@Test
	void mocking() {
		List<String> mock = mock(List.class);
		when(mock.get(0)).thenReturn("Mocked Value");
		System.out.println(mock.get(0));
	}

}

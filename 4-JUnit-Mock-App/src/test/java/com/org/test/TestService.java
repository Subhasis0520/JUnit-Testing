package com.org.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import com.org.dao.UserDao;
import com.org.service.UserService;

public class TestService {

	@Test
	public void testGetName() {
		//create Mock object for UserDao
		UserDao userDao = PowerMockito.mock(UserDao.class);
		
		// set the behavior of mock object
		PowerMockito.when(userDao.findNameById(101)).thenReturn("Anup");
		
		// Inject in user-service class
		UserService service = new UserService(userDao);
		
		// test the getName method
		String name = service.getName(101);
		assertEquals("Anup", name);
	}
}

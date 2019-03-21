/*package com.revature.testing;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revature.exception.LoginFailedException;
import com.revature.model.User;
import com.revature.service.UserService;



public class UserServiceTest {
	private User testUser;
	private User testLoginUser;
	
    @Before
    public void setUp() {
    	//Existing User in TEST DB
    	testUser = new User("palagnajr","");
    	//Invalid credentials
    	testLoginUser = new User("palagnajr","12345678");
    }
    
    @After
	public void tearDown() {
		testUser = null;
		testLoginUser = null;
	}
    

    @Test(expected = LoginFailedException.class)
	public void loginTest() throws LoginFailedException {
		UserService.getUserService().login(testLoginUser);
	}
    
    @Test
    public void getAllUsersTest() {
    	assertTrue(UserService.getUserService().getAllEmployees().size() > 0);
    }
    
    @Test
	public void isUsernameTakenTest()  {
		assertTrue(UserService.getUserService().isUsernameTaken(testUser.getUsername()));		
	}
   

    @Test
    public void getUserInfoTest() {
    	User user = UserService.getUserService().getUserInfo(testUser.getUsername());
    	
    	assertTrue(user.getUsername().equals(testUser.getUsername()));
    }
}
*/
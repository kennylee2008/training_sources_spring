package cn.com.leadfar.spring;

import java.io.File;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class UserService{
	
	private UserAction userAction;
	
	public UserService(UserAction userAction) {
		this.userAction = userAction;
	}

	public void addUser(){
		System.out.println("UserService.addUser()");
	}
	
	public void uploadExcel(File f){
		
		
	}

}

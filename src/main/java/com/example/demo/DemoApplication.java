package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//1、返回IOC容器
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

		//2、查看容器里面的组件
		String[] names = run.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);

		}
	}

}

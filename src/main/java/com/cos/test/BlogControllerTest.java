package com.cos.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
//스프링이 com.cos 패키지 이하를 스캔해서 특정annotation이 붙어있는
//클래스 파일들을 new 해서(IOC) 스프링 테이너에 관리해줌.
public class BlogControllerTest {
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
	
}

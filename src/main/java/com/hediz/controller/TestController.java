package com.hediz.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hediz.dto.LoginDTO;

import io.swagger.annotations.ApiOperation;

//Rest 서비스

@RestController // @Controller + @ResponseBody
public class TestController {

	@ApiOperation(value = "권동혁 응답")
	@GetMapping("/main6")
	public ResponseEntity<LoginDTO> home6() {
		
		//LoginDTO 생성
		LoginDTO dto = new LoginDTO("홍길동", "1234");
		
//		return ResponseEntity.ok(dto);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	

	// http://localhost:8090/app/main5/1/aaa
		@ApiOperation(value = "PathVariable 실습")
		@GetMapping("/main5/{num}/{name}")
		public String main5(@PathVariable("num") int num, @PathVariable("name") String name) {
			System.out.println(num+"\t"+name);
			return "Hello";
		}
		
	// http://localhost:8090/app/main4/3or1or...
	@GetMapping("/main4/{num}")
	public String main4(@PathVariable("num") int num) {
		System.out.println(num);
		return "Hello";
	}
	
	@GetMapping("/main")
	public String main() {
		return "Hello";
	}
	
	@GetMapping("/main2")
	public LoginDTO home() {
		
		//LoginDTO 생성
		LoginDTO dto = new LoginDTO("홍길동", "1234");
		
		return dto;
	}
	
	@GetMapping("/main3")
	public List<LoginDTO> home2() {
		
		List<LoginDTO> list = Arrays.asList(new LoginDTO("홍길동", "1234"),new LoginDTO("홍길동", "1234"));
		
		return list;
	}
}

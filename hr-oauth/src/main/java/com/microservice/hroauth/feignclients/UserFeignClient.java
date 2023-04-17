package com.microservice.hroauth.feignclients;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.microservice.hroauth.entities.User;

@Component
@org.springframework.cloud.openfeign.FeignClient(name = "hr-user", path = "/hr-user")
public interface UserFeignClient {
	
	@GetMapping(value = "/users/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email);
}

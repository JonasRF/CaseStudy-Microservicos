package com.microservice.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.hrpayroll.entities.Worker;

@FeignClient(name = "hr-worker", path = "/hr-worker")
public interface WorkerFeignClient {

	@GetMapping(value = "/workers/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}

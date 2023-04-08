package com.microservice.hrpayroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.hrpayroll.entities.Payment;
import com.microservice.hrpayroll.services.PaymentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	
	@Autowired
	PaymentService servive;

	@CircuitBreaker(name = "default", fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{workerId}/days/{days}")
		public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		Payment payment = servive.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}

	public ResponseEntity<Payment> getPaymentAlternative(Exception ex) {
		Payment payment = new Payment("Brann", 400.0, 3);
		return ResponseEntity.ok(payment);
	}
}

package controller;

import org.springframework.web.bind.annotation.GetMapping;

import bean.Limits;

public class LimitsController {
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(1, 1000);
	}
}

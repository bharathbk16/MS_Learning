package com.apps.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.learning.config.AppConfig;
import com.apps.learning.config.LimitsConfiguration;

@RestController
public class LimitsController {

	@Autowired
	AppConfig appConfig;

	@GetMapping(value = "/limits")
	public LimitsConfiguration getLimits() {
		return new LimitsConfiguration(appConfig.getMaximum(), appConfig.getMinimum());
	}

}

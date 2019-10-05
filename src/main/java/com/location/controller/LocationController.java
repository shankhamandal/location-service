package com.location.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.model.Location;

@RestController
@RequestMapping("/api/v1/location")
public class LocationController {

	@Value("${server.port}")
	private int port;

	@GetMapping(produces = "application/json")
	public Location getLocation() {
		return new Location("City 1", 1111, "street 1", port);
	}

}

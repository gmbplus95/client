/**
 * 
 */
package com.ifi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 * Jun 3, 2019
 */
@RestController
public class ClientController {
	@Value("${test.msg}")
	String msg;
	@GetMapping("/status/check")
	public String status() {
	return "Working on token " + msg;
	}
}

package com.iats.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iats.constant.Constant;
import com.iats.model.request.UserRequest;
import com.iats.model.response.UserResponse;
import com.iats.model.response.UserResponseList;
import com.iats.service.UserService;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/getUsers")
	public ResponseEntity<?> getUsersList(@Valid @RequestBody UserRequest request) {

		UserResponse response = new UserResponse(Constant.STATUS_TRUE, Constant.SUCCESS);
		UserResponseList obj = userService.getUserList(request);
		response.setData(obj);
		return ResponseEntity.ok(response);
	}
}

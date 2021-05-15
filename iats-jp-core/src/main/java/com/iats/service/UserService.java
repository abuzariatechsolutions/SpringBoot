package com.iats.service;

import com.iats.model.request.UserRequest;
import com.iats.model.response.UserResponseList;

public interface UserService {

	public UserResponseList getUserList(UserRequest userRequest);
}

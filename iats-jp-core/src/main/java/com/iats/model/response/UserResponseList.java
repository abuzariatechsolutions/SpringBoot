package com.iats.model.response;

import java.util.ArrayList;
import java.util.List;

public class UserResponseList {

	private long totalPages;
	private long totalCount;
	private int pageNo;
	private List<UserResponseDto> users;

	public UserResponseList() {
		users = new ArrayList<UserResponseDto>();
	}

	public long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public List<UserResponseDto> getUsers() {
		return users;
	}

	public void setUsers(List<UserResponseDto> users) {
		this.users = users;
	}

}

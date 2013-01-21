package com.rainier.cygnoides.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.rainier.cygnoides.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}

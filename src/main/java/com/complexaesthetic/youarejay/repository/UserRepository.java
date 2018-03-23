package com.complexaesthetic.youarejay.repository;

import com.complexaesthetic.youarejay.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * project: YouAreJay
 * package: com.complexaesthetic.youarejay.repository
 * author: https://github.com/vvmk
 * date: 3/22/18
 */
public interface UserRepository extends CrudRepository<User, Long> {
}

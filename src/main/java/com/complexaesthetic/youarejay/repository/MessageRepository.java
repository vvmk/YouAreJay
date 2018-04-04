package com.complexaesthetic.youarejay.repository;

import com.complexaesthetic.youarejay.entity.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * project: YouAreJay
 * package: com.complexaesthetic.youarejay.repository
 * author: https://github.com/vvmk
 * date: 3/22/18
 */
public interface MessageRepository extends CrudRepository<Message, Long> {
    Iterable<Message> findAllForUser(Long userid);
}

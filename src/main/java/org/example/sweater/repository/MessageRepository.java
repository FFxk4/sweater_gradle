package org.example.sweater.repository;

import org.example.sweater.domain.DotMessage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<DotMessage, Long> {

	List<DotMessage> findByTag(String tag);
}

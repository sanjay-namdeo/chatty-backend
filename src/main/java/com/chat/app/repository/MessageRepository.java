package com.chat.app.repository;

import com.chat.app.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    @Override
    List<Message> findAll();

    @Override
    Message save(Message message);

    @Override
    Optional<Message> findById(Long aLong);

    @Override
    List<Message> findAllById(Iterable<Long> longs);

    @Override
    void deleteById(Long aLong);
}

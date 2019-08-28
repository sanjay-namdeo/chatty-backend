package com.chat.app.chatty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface StudentRepository extends CrudRepository<Student, Long> {
}
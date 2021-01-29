package com.srg.cassandra.api.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.srg.cassandra.api.model.User;

public interface UserRepository  extends CassandraRepository<User, Integer>{

}

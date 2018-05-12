package com.sdf.jewelry.repositories;

import com.sdf.jewelry.model.User;
import org.springframework.data.repository.CrudRepository;

public interface  UserRepository extends CrudRepository<User, Long> {

}

package com.training.site.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by norris on 3/17/2016.
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}

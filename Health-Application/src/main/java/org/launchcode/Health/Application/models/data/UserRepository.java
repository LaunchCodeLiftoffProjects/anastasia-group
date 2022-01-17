package org.launchcode.Health.Application.models.data;

import org.launchcode.Health.Application.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User,Integer> {
}

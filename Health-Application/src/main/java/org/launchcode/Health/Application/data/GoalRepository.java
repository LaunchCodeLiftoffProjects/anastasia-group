package org.launchcode.Health.Application.data;

import org.launchcode.Health.Application.models.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepository extends CrudRepository<Goal, Integer> {
}

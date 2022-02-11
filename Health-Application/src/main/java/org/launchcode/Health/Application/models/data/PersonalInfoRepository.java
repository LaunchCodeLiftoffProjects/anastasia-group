package org.launchcode.Health.Application.models.data;

import org.launchcode.Health.Application.models.personal.PersonalInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInfoRepository extends CrudRepository<PersonalInfo,Integer> {
}

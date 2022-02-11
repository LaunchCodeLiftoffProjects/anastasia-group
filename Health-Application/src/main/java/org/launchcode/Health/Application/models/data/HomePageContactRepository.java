package org.launchcode.Health.Application.models.data;

import org.launchcode.Health.Application.models.homePage.HomePageContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePageContactRepository extends CrudRepository<HomePageContact,Integer> {
}

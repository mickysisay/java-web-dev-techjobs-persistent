package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.OrderBy;
import java.util.List;

@Repository
public interface EmployerRepository extends CrudRepository<Employer,Integer> {
    public List<Employer> findAllByOrderByNameAsc();

}

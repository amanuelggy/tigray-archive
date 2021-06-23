package com.tigrayArchive.home.homeRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tigrayArchive.home.domains.Evidence;

@Repository
public interface HomeRepo extends CrudRepository<Evidence, Long>{

}

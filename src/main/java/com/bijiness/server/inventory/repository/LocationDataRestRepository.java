package com.bijiness.server.inventory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bijiness.server.inventory.entity.Location;
import com.bijiness.server.inventory.entity.Student;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(path = "locations", collectionResourceRel = "locations")
public interface LocationDataRestRepository extends PagingAndSortingRepository<Location, String> {

}

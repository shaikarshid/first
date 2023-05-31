package com.vehicle1.vehicle1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface vehiclerepo extends CrudRepository<Vehicle, Integer> 
{
	List<Vehicle> findByvName(String vName);
	

}

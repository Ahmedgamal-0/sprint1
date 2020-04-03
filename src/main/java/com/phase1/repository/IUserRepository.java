package com.phase1.repository;
import org.springframework.data.repository.CrudRepository;

import com.phase1.models.Buyers;
//import com.phase1.models.Admin;
//import com.phase1.models.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface IUserRepository extends CrudRepository<Buyers, Long>
{

}

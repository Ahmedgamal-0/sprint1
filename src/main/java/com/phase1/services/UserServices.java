package com.phase1.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

import com.phase1.models.Admin;
import com.phase1.models.Buyers;
import com.phase1.models.StoreOwners;
//import com.phase1.models.Admin;
//import com.phase1.models.User;
import com.phase1.repository.IAdminRepository;
import com.phase1.repository.IStoreOwnerRepository;
import com.phase1.repository.IUserRepository;

@Service
public class UserServices implements IUserServices{

	@Autowired
	private IUserRepository buyer;
	@Autowired
	private IAdminRepository admin;
	@Autowired
	private IStoreOwnerRepository storeowner;
	
	
	@Override
	public boolean addUser(Buyers newUser) {
		
		buyer.save(newUser);
		return true;
	}
	@Override
	public boolean addStoreOwner(StoreOwners newUser) {
		
		storeowner.save(newUser);
		return true;
		
	}
	@Override
	public boolean addAdmin(Admin newUser) {
		admin.save(newUser);
		return true;
		
	}

	@Override
	public List<Buyers> getAllUsers() {
		// TODO Auto-generated method stub
		Iterable<Buyers> usersIter=buyer.findAll();
		List<Buyers> all= new ArrayList<Buyers>();
		for(Buyers user: usersIter)
			all.add(user);
		
		return all;
	}

}

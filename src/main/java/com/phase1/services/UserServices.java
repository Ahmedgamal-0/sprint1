package com.phase1.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
		public boolean IsAdmin(String name,String pass) {
		Iterable<Admin> usersIter= admin.findAll();
		  for(Admin user: usersIter)
		  {	if(user.getusername().equals(name) && user.getPassword().equals(pass))
		  return true;
		  }
		  	return false;
		  }
	  @Override
		  public boolean IsBuyer(String name,String pass)
		  {
		  Iterable<Buyers> usersIter= buyer.findAll();
		  for(Buyers user: usersIter)
		  {	if(user.getusername().equals(name) && user.getPassword().equals(pass))
		  return true;
		  }
		  	return false;

		  }
	  @Override
	     public boolean IsStoreOwner(String name,String pass) {

		  Iterable<StoreOwners> usersIter= storeowner.findAll();
		  for(StoreOwners user: usersIter) {
		    if(user.getusername().equals(name) && user.getPassword().equals(pass))
				  return true;
				  }
				  	return false;
			}



	@Override
	public List<Buyers> getAllUsers(@RequestParam String name,@RequestParam String pass) {
		// TODO Auto-generated method stub
		if(IsAdmin(name,pass)) {
		Iterable<Buyers> usersIter=buyer.findAll();
		List<Buyers> all= new ArrayList<Buyers>();
		for(Buyers user: usersIter)
			all.add(user);

		return all;
		}
		return null;
	}

}

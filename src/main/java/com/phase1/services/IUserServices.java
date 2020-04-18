package com.phase1.services;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.phase1.models.Admin;
import com.phase1.models.Buyers;
import com.phase1.models.StoreOwners;
//import com.phase1.models.Admin;
//import com.phase1.models.User;

public interface IUserServices {
	public boolean addUser(Buyers newUser);
	public boolean addStoreOwner(StoreOwners newUser);
	public boolean addAdmin(Admin newUser);
	public boolean IsAdmin(String name,String pass);
	public boolean IsBuyer(String name,String pass);
	public boolean IsStoreOwner(String name,String pass);
	public List<Buyers> getAllUsers(@RequestParam String name,@RequestParam String pass);
}

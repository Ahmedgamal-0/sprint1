package com.phase1.services;
import java.util.List;

import com.phase1.models.Admin;
import com.phase1.models.Buyers;
import com.phase1.models.StoreOwners;
//import com.phase1.models.Admin;
//import com.phase1.models.User;

public interface IUserServices {
	public boolean addUser(Buyers newUser);
	public boolean addStoreOwner(StoreOwners newUser);
	public boolean addAdmin(Admin newUser);
	
	public List<Buyers> getAllUsers();
}

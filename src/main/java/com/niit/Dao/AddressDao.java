package com.niit.Dao;

import java.util.List;

import com.niit.Model.Address;

public interface AddressDao {
	
	
		
			public boolean saveOrUpdate(Address address);
			
			public Address getAddressById(int addressId);
			
			public boolean deleteAddressById(int addressId);
			
			public List<Address> getAllAddressOfUser(int userId);
			
			public Address getAddressOfUser(int userId);
		

	}
	



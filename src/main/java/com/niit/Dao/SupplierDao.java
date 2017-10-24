package com.niit.Dao;


import java.util.List;


import com.niit.Model.Supplier;

public interface SupplierDao {

	
		        public boolean addSupplier(Supplier supplier);
			    public List<Supplier> retrieveSupplier();
			    public boolean deleteSupplier(Supplier supplier);
			    public Supplier getSupplier(int supId);
			    public boolean updateSupplier(Supplier supplier);

		
}

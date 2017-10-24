package com.niit.Model;
import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Supplier
{

	    @Id
	    @GeneratedValue
	    int supId;
	     
	    String supName,supDesc,supAddress;
	 
	
		public void setSupId(int supId) {
	        this.supId = supId;
	    }
	 
	    
	    
	    public int getSupId() {
	        return supId;
	    }
	 
	    
	    public String getSupName() {
	        return supName;
	    }
	 
	    public void setSupName(String supName) {
	        this.supName = supName;
	    }
	 
	    public String getSupDesc() {
	        return supDesc;
	    }
	 
	    public void setSupDesc(String supDesc) {
	        this.supDesc = supDesc;
	    }
	    
	    public String getSupAddress() {
				return supAddress;
			}

			public void setSupAddress(String supAddress) {
				this.supAddress = supAddress;
			}


		
	     
	
}

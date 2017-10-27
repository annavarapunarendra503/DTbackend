package com.niit.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User
{
	
	private static final long serialVersionUID = -5294671367987983736L;
	
        @Id
		@GeneratedValue
		private int id;

		
		
		private String username;
		private String email;
		private String password;
		private String contact;
		private String role;
		private String Address;
		private boolean enabled;
		
		   public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}


		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}
		
	

		public int getId() {
			return  id;
		}

		public void setId(int id) {
			this.id = id;
		}

	
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

	
}

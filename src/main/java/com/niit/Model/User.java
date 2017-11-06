package com.niit.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User
{

	private static final long serialVersionUID = -5294671367987983736L;
	
        @Id
		@GeneratedValue
		private int id;

        
		@NotNull(message="please enter the username")
		@Size(min=5,max=10)
		private String username;
		@NotNull(message="please enter the emaild")
		private String email;
		@NotNull(message="please enter the password")
		@Size(min=5,max=10)
		private String password;
		@NotNull(message="please enter the contact details")
		@Pattern(regexp="(^$|[0-9] {10})")
		private String contact;
		private String role;
		@NotNull(message="please enter the password")
		@Size(min=10,max=30)
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

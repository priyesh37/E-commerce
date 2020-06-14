package vo;

public class signupvo {

			public int id,id2;
			public String name,contact,email,password,role;

			public signupvo() {
				//super();
			}

			public signupvo(String name, String contact, String email, String password,String role) {
				super();
				this.name = name;
				this.contact = contact;
				this.email = email;
				this.password = password;
				this.role=role;
			}
			
			public int getId2() {
				return id2;
			}

			public void setId2(int id2) {
				this.id2 = id2;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getContact() {
				return contact;
			}

			public void setContact(String contact) {
				this.contact = contact;
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

			public String getRole() {
				return role;
			}

			public void setRole(String role) {
				this.role = role;
			}
			
			
}

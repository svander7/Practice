package com.coderscampus.A3;

public class User {

		private String username;
		private String password;
		private String name;

		public User(String[] userStringArray) {
			this.setUsername(userStringArray[0]);
			this.setPassword(userStringArray[1]);
			this.setName(userStringArray[2]);
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
}

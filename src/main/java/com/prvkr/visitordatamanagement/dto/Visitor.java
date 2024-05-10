package com.prvkr.visitordatamanagement.dto;

public class Visitor {
		private int id;
		private String name;
		private String contact;
		private String email;
		private String degree;
		private String stream;
		private String throughtoutpercentage;
		private int yearofpassout;
		private String gender;
		private String course;
		private String adress;
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
		public String getDegree() {
			return degree;
		}
		public void setDegree(String degree) {
			this.degree = degree;
		}
		public String getStream() {
			return stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		public String getThroughtoutpercentage() {
			return throughtoutpercentage;
		}
		public void setThroughtoutpercentage(String throughtoutpercentage) {
			this.throughtoutpercentage = throughtoutpercentage;
		}
		public int getYearofpassout() {
			return yearofpassout;
		}
		public void setYearofpassout(int yearofpassout) {
			this.yearofpassout = yearofpassout;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		@Override
		public String toString() {
			return "Visitor [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + ", degree="
					+ degree + ", stream=" + stream + ", throughtoutpercentage=" + throughtoutpercentage
					+ ", yearofpassout=" + yearofpassout + ", gender=" + gender + ", course=" + course + ", adress="
					+ adress + "]";
		}
		
	}


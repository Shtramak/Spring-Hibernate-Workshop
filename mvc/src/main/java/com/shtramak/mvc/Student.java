package com.shtramak.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name = "Name";
	private String surname = "Surname";
	private Integer age = -1;
	private String country;
	private String programmingLanguage;
	private String[] operatingSystem;
	private Map<String, String> countries;

	public Student() {
		countries = new LinkedHashMap<>();
		countries.put("Ukraine", "UA");
		countries.put("United States", "US");
		countries.put("Germany", "DE");
		countries.put("England", "EN");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String lastName) {
		this.surname = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}

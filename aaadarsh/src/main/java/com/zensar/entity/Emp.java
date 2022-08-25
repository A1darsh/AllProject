package com.zensar.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
@Component 
public class Emp {

	private String name;
	private List<String> phones;
	private Set<String> addre;
	private Map<String,String> cources;
	
	public Emp() {
		super();
	}
	public Emp(String name, List<String> phones, Set<String> addre, Map<String, String> cources) {
		super();
		this.name = name;
		this.phones = phones;
		this.addre = addre;
		this.cources = cources;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddre() {
		return addre;
	}
	public void setAddre(Set<String> addre) {
		this.addre = addre;
	}
	public Map<String, String> getCources() {
		return cources;
	}
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addre=" + addre + ", cources=" + cources + "]";
	}
	
	
	
}

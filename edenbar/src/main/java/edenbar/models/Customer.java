package edenbar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idcustomer;
	private String name;
	private String keyword;
	private float credit;
	
	public Customer(Integer idcustomer, String name,String keyword, float credit){
		this.idcustomer=idcustomer;
		this.name=name;
		this.keyword=keyword;
		this.credit=credit;
	}
	
	public Customer(){};
	
	public Integer getidcustomer() {
		return idcustomer;
	}

	public void setidcustomer(Integer idcustomer) {
		this.idcustomer = idcustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}
	
}

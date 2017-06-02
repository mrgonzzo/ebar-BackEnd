package edenbar.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idbill;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Timestamp datebill;
	private Integer idcustomer;
	private float pricebill; // this pricebill is the  sumatory of the prices of each id_order which contains the idbill
	private boolean paid; 
	
	public Bill(Integer idcustomer,float pricebill, boolean paid){
		this.idbill=null;
		this.datebill=null;
		this.idcustomer=idcustomer;
		this.pricebill=pricebill;
		this.paid=paid;		
	}

	public Integer getidbill() {
		return idbill;
	}

	/*public void setidbill(Integer idbill) {
		this.idbill = idbill;
	}*/

	public Timestamp getdatebill() {
		return datebill;
	}

	/*public void setdatebill(Timestamp datebill) {
		this.datebill = datebill;
	}*/

	public Integer getidcustomer() {
		return idcustomer;
	}

	public void setidcustomer(Integer idcustomer) {
		this.idcustomer = idcustomer;
	}

	public float getpricebill() {
		return pricebill;
	}

	public void setpricebill(float pricebill) {
		this.pricebill = pricebill;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	

}

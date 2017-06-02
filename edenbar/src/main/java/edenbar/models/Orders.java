package edenbar.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idorder;
	// columnDefinition could simply be = "TIMESTAMP", as the other settings are the MySQL default
	@Column(name="dateorder", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateorder;
	private Integer idcustomer;
	private Integer iddrink;
	private float priceorder;

	public Orders(Integer idcustomer, Integer iddrink, float priceorder) {
		this.idorder=null;
		this.dateorder=null;
		this.idcustomer = idcustomer;
		this.iddrink = iddrink;
		this.priceorder = priceorder;
	}
    public Orders(){
    	
    }
    
	
	public Date getdateorder() {
		return dateorder;
	}
	public void setdateorder(Date dateorder) {
		this.dateorder = dateorder;
	}
	public Integer getidcustomer() {
		return idcustomer;
	}
	public void setidcustomer(Integer idcustomer) {
		this.idcustomer = idcustomer;
	}
	public Integer getidorder() {
		return idorder;
	}

	public void setidorder(Integer idorder) {
		this.idorder = idorder;
	}

	

	public Integer getiddrink() {
		return iddrink;
	}

	public void setiddrink(Integer iddrink) {
		this.iddrink = iddrink;
	}

	
	public float getpriceorder() {
		return priceorder;
	}

	public void setpriceorder(float priceorder) {
		this.priceorder = priceorder;
	}
	
	
}

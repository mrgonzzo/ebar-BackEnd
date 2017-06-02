package edenbar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drinks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer iddrink;
	private String drink;
	private String kind;
	private float  pricedrink;
	
	public Drinks(String drink,	String kind, float  pricedrink) {
		this.iddrink = null;
		this.drink = drink;
		this.kind = kind;
		this.pricedrink = pricedrink;
	}
	public Drinks(){
		
	};
	
	public Integer getiddrink() {
		return iddrink;
	}

	/*public void setiddrink(Integer iddrink) {
		this.iddrink = iddrink;
	}*/

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public float getpricedrink() {
		return pricedrink;
	}

	public void setpricedrink(float pricedrink) {
		this.pricedrink = pricedrink;
	}
	
	
}

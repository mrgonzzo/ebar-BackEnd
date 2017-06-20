/*package edenbar.models;

public class WsRcvOrder {
	private Integer ro;

	public WsRcvOrder() {

	};
    public WsRcvOrder(Integer ro){
    	this.ro=ro;
    }
	public Integer getro() {
		
		return ro;
	}
	public void setro(Integer ro) {
		this.ro = ro;
	};
    
    
}*/

package edenbar.models;

import java.io.Serializable;

public class WsRcvOrder implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ro;

	public WsRcvOrder() {

	};
    public WsRcvOrder(Integer ro){
    	this.ro=ro;
    }
	public Integer getro() {
		return ro;
	}
	public void setro(Integer ro) {
		this.ro = ro;
	};
    
    
}

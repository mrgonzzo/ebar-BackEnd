package edenbar.models;

public class WsRcvOrder {
	private Orders order;

	public WsRcvOrder() {

	};
    public WsRcvOrder(Orders order){
    	this.order=order;
    }
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	};
    
    
}

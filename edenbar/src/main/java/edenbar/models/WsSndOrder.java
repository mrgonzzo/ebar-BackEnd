/*package edenbar.models;

public class WsSndOrder {

	private String content;

	public WsSndOrder() {

	};

	public WsSndOrder(String content) {
		// TODO Auto-generated constructor stub
		this.content = content;
	}

	public String getContent() {
		return content;
	};

	public void setContent(String content) {
		this.content = content;
	};

}*/

package edenbar.models;

import java.io.Serializable;

public class WsSndOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String content;

	public WsSndOrder() {

	};

	public WsSndOrder(String content) {
		// TODO Auto-generated constructor stub
	}

	public String getContent() {
		return content;
	};

	public void setContent(String content) {
		this.content = content;
	};

}

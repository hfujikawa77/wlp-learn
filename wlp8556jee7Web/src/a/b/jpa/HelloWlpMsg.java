package a.b.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HELLO_WLP_MSG database table.
 * 
 */
@Entity
@Table(name="HELLO_WLP_MSG")
@NamedQuery(name="HelloWlpMsg.findAll", query="SELECT h FROM HelloWlpMsg h")
public class HelloWlpMsg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MSG_ID")
	private int msgId;

	private String msg;

	private String updated;

	public HelloWlpMsg() {
	}

	public int getMsgId() {
		return this.msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

}
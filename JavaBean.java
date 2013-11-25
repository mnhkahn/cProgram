import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement
public class JavaBean {
	@XmlElement
	private Map items = new HashMap<>();

	public void setItems(Map map) {
		this.items = map;
	}
}
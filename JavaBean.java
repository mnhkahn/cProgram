import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement
public class JavaBean {
	@XmlElement
	private int age;
	private String name = "CY";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
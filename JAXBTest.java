import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;

public class JAXBTest {

	public static void main(String args[]) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(JavaBean.class);
		
		Marshaller marshaller = context.createMarshaller();
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		JavaBean test = new JavaBean();
		Map map = new HashMap<>();
		map.put("pic", "123");
		test.setItems(map);
		
		marshaller.marshal(test, System.out);
//		OutputStream os = new FileOutputStream("JAXBTest.xml");
//		marshaller.marshal(test, os);
		
//		InputStream is = new FileInputStream("JAXBTest.xml");
//		test = (JavaBean)unmarshaller.unmarshal(is);
//		System.out.println(test.getName());
	}
}
package co.edureka.xml;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Employee{

	// Attributes for Employee Object
	int eid;
	String name;
	int salary;
	String email;
	String address;

}

public class DOMWriter {

	public static void main(String[] args) {
		
		try {
			
			// Object contains content, which we need to save in XMl File
			Employee emp1 = new Employee();
			emp1.eid = 101;
			emp1.name = "John";
			emp1.salary = 50000;
			emp1.email = "john@example.com";
			emp1.address = "Redwood Shores";
			
			
			//1. To create Document Object
			
			// newInstance() will create and return the object of DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Java Object as Tree Data Structure which will hold xml tags and content in them
			
			//2. To create tags
			Element elmRoot = document.createElement("employees");
			Element elmEmployee = document.createElement("employee");
			Element elmEid = document.createElement("eid");
			Element elmName = document.createElement("name");
			Element elmSalary = document.createElement("salary");
			Element elmEmail = document.createElement("email");
			Element elmAddress = document.createElement("address");
			
			//3. To Create content for tags
			Text txtEid = document.createTextNode(String.valueOf(emp1.eid));
			Text txtName = document.createTextNode(emp1.name);
			Text txtSalary = document.createTextNode(String.valueOf(emp1.salary));
			Text txtEmail = document.createTextNode(emp1.email);
			Text txtAddress = document.createTextNode(emp1.address);
			
			//4. Add content into tags
			elmEid.appendChild(txtEid);
			elmName.appendChild(txtName);
			elmSalary.appendChild(txtSalary);
			elmEmail.appendChild(txtEmail);
			elmAddress.appendChild(txtAddress);
			
			//5. Add Tags into the employee tag
			elmEmployee.appendChild(elmEid);
			elmEmployee.appendChild(elmName);
			elmEmployee.appendChild(elmSalary);
			elmEmployee.appendChild(elmEmail);
			elmEmployee.appendChild(elmAddress);
			
			//6. Add Tag employee into tag employees and employees into document
			elmRoot.appendChild(elmEmployee);
			document.appendChild(elmRoot);			
			
			//7. We need to transform document object into an XML File

			// Source
			DOMSource source = new DOMSource(document);
			
			// Destinition
			File file = new File("/Users/ishantkumar/Downloads/myemployees6oct.xml");
			FileOutputStream fos = new FileOutputStream(file);
			StreamResult result = new StreamResult(fos);
			
			// We shall Use a Tranformer API to convert source to destintion
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			
			transformer.transform(source, result);
			
			System.out.println("== XML File "+file.getName()+" Created==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		

	}

}

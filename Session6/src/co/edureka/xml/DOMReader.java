package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMReader {

	public static void main(String[] args) {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/employees6oct.xml");
			
			//1. To create Document Object
			
			// newInstance() will create and return the object of DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // Java Object as Tree Data Structure which will hold xml tags and content by reading XML File
			
			String root = document.getDocumentElement().getNodeName();
			System.out.println("Root Tag is: "+root);
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println(nodeList.getLength()+" employee tags found in "+file.getName());
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i); // 0 to 4, total of 5 employee tag items
				
				// Downcast node into Element API
				Element elm = (Element)node;
				
				String eid = elm.getElementsByTagName("eid").item(0).getTextContent();
				String name = elm.getElementsByTagName("name").item(0).getTextContent();
				String salary = elm.getElementsByTagName("salary").item(0).getTextContent();
				String email = elm.getElementsByTagName("email").item(0).getTextContent();
				String address = elm.getElementsByTagName("address").item(0).getTextContent();
				
				System.out.println(eid+"\t"+name+"\t"+salary+"\t"+email+"\t"+address);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}

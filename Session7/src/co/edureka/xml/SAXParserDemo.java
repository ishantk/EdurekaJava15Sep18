package co.edureka.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class SAXHandler extends DefaultHandler{
	
	// When XML File Parsing Begins
	public void startDocument() throws SAXException {
		System.out.println("==startDocument==");
	}
	
	// When we read the starting tag
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	// Content between the tags
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		System.out.print(data);
	}

	// When we read the closing/ending tag
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	
	// When XML File Parsing Finishes
	public void endDocument() throws SAXException {
		System.out.println("==endDocument==");
	}
	
}

public class SAXParserDemo {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/myemployees.xml");
			FileInputStream fis = new FileInputStream(file);
			
			SAXHandler handler = new SAXHandler();
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			parser.parse(fis,handler);
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}

	}

}

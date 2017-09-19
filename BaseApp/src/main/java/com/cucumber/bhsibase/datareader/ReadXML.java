/*package com.cucumber.bhsibase.datareader;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;



public class ReadXML extends DefaultHandler {

	File xmlFile = null;
//	ReadXML readxml = new ReadXML();

	public String readxml(String value, String file) {

		try {

			SAXBuilder builder = new SAXBuilder();
			if (file == "PartyData") {

				xmlFile = new File("\\src\\main\\java\\com\\cucumber\\bhsibase\\data\\PartyData.xml");
			} else if (file == "PolicyData") {

				xmlFile = new File("");
			} else {

				xmlFile = new File("");
			}

		Document document = builder.build(xmlFile);
			Element classElement = document.getRootElement();
			System.out.println("classElement:::::::::::::::"+classElement);
			
			List<Element> elements = classElement.getChildren();
			for (int temp = 0; temp < elements.size(); temp++) {

				Element data = elements.get(temp);
				System.out.println("data:::::::::::::::::::::"+data);
				value = data.getChild(value).getText();
				System.out.println("data:::::::::::::::::::::"+value);
			}
			
			 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	     org.w3c.dom.Document doc = dBuilder.parse(xmlFile);
	     doc.getDocumentElement().normalize();
	     NodeList nList = doc.getElementsByTagName(value);
	     for (int temp = 0 ; temp< nList.getLength() ; temp++){
	    	 Node nNode = nList.item(temp) ; 
	     }
	     

		} catch (Exception e) {

		}

		return value;

	}
}
*/
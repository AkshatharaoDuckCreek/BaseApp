package com.cucumber.bhsibase.datareader;

import java.io.File;

import javax.swing.text.Document;

import org.jdom.input.SAXBuilder;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXML extends DefaultHandler {

	File xmlFile = null;
	ReadXML readxml = new ReadXML();

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

		//	Document document = builder.build(xmlFile) ; 
		} catch (Exception e) {

		}

		return value;

	}
}

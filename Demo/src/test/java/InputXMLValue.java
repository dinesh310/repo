import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class InputXMLValue {
	
	public static String RootFolder = System.getProperty("user.dir");
	public static String IXML = RootFolder+"\\XML\\Request.xml";

	public static void UpdateXMLFile() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		// TODO Auto-generated method stub
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(IXML);
//		Reader fileReader = new FileReader(IXML);
//		BufferedReader bufReader = new BufferedReader(fileReader);
//		
//		StringBuilder sb = new StringBuilder(); 
//		String line = bufReader.readLine(); 
//		while( line != null){ 
//			sb.append(line).append("\n");
//			line = bufReader.readLine();
//			}
//
//		String xml2String = sb.toString();
//		System.out.println("XML to String using BufferedReader : "); 
		//System.out.println(xml2String);
//		bufReader.close();
//		
//		BufferedReader in = new BufferedReader(new FileReader(xml2String));
//		String str=null;
//		ArrayList<String> lines = new ArrayList<String>();
//		while((str = xml2String.readLine()) != null){
//		    lines.add(str);
//		    
//		    System.out.println(lines);
//		}

//		
//		File xmlFile = new File(IXML);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder;	
//        
//        dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        
        updateAttributeValue(doc);
		
        doc.getDocumentElement().normalize();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("employee_updated.xml"));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);
        System.out.println("XML file updated successfully");
		
	}
        
        
        private static void updateAttributeValue(Document doc) {
        	NodeList employees = doc.getElementsByTagName("Employee");
            Element emp = null;
            //loop for each employee
            for(int i=0; i<employees.getLength();i++){
                emp = (Element) employees.item(i);
                Node name = emp.getElementsByTagName("age").item(0).getFirstChild();
                name.setTextContent("30");
            }

            }

	}



package hu.uni.miskolc.iit.softwaretesting;

import hu.uni.miskolc.iit.softwaretesting.dao.BookDaoXMLImpl;

import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class BookDAOTest {

    private BookDaoXMLImpl dao;

    public BookDAOTest () throws IOException, SAXException, ParserConfigurationException {
        File inputFile = new File("resources/database.xml");
        this.dao = new BookDaoXMLImpl(inputFile, inputFile);
    }

    //TODO
}

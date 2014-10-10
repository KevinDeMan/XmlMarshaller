package com.realdolmen.com.pojo.xml;

import com.realdolmen.com.pojo.domain.SomeObject;
import org.junit.Before;

import java.io.StringWriter;

import static org.junit.Assert.*;

public class XmlPojoTest {

    private SomeObject someObject;
    private final String XML_OF_SOMEOBJECT = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><student id=\"1\"><name>De Man</name><surName>Kevin</surName></student>";

    @Before
    public void setUp() {
        someObject = new SomeObject();
        someObject.setId(1);
        someObject.setName("De Man");
        someObject.setSurName("Kevin");
    }

    @org.junit.Test
    public void testToXml() throws Exception {
        XmlPojoConvertor pojo = new XmlPojoConvertor();
        StringWriter xml = pojo.toXml(someObject, SomeObject.class);
        System.out.println( xml );
        assertNotNull( xml );
    }

    @org.junit.Test
    public void testToPojo() throws Exception {
        XmlPojoConvertor pojo = new XmlPojoConvertor();
        SomeObject someObjectFromXml = (SomeObject) pojo.toPojo( XML_OF_SOMEOBJECT, SomeObject.class);
        assertEquals("Id must be 1", 1, someObjectFromXml.getId());
        assertEquals("Name must be De Man", "De Man", someObjectFromXml.getName());
        assertEquals("Surname must be Kevin", "Kevin", someObjectFromXml.getSurName());
    }
}


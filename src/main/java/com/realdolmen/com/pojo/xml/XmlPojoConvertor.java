package com.realdolmen.com.pojo.xml;

import com.realdolmen.com.pojo.domain.SomeObject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by KDAAU95 on 10/10/2014.
 */
public class XmlPojoConvertor<T extends Object> {

    public StringWriter toXml(T object, Class javaClass) throws Exception {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(javaClass);
        Marshaller m = context.createMarshaller();
        m.marshal(object, writer);
        return writer;
    }

    public Object toPojo(String xml, Class javaClass) throws Exception {
        JAXBContext context = JAXBContext.newInstance(javaClass);
        Unmarshaller m = context.createUnmarshaller();
        Object object = m.unmarshal(new StringReader(xml));
        return object;
    }
}

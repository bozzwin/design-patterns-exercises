package com.orangeandbronze.strategy;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class FileFormatXml implements FileFormat {
	public List<Student> unmarshal(File file) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Wrapper.class,
				Student.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		StreamSource xml = new StreamSource(file);
		Wrapper<Student> wrapper = (Wrapper<Student>) unmarshaller
				.unmarshal(xml, Wrapper.class).getValue();
		return wrapper.getItems();
	}
}
